import React,{ useState, useEffect } from 'react';

const SavedUrlsManager = () => {
    const [urls, setUrls] = useState([]);
    const [currentUrl, setCurrentUrl] = useState('');
    const [editingIndex, setEditingIndex] = useState(null);
    const [isEditing, setIsEditing] = useState(false)

    const updateJspInputField = (url) => {
        document.getElementById('url').value = url;
    };

    useEffect(() => {
        // Add an event listener to the select element
        const select = document.getElementById('savedUrls');
        if (select) {
            select.addEventListener('change', (e) => updateJspInputField(e.target.value));
        }

        fetch('/UrlManagerGetUrls', {
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`HTTP error! status: ${response.status}`);
                }
                return response.json();
            })
            .then(data => {
                setUrls(data);
                updateSelectOptions(data);
            })
            .catch(error => {
                console.error('Error fetching saved URLs:', error);
            });

        // Remove the event listener when the component unmounts
        return () => {
            if (select) {
                select.removeEventListener('change', (e) => updateJspInputField(e.target.value));
            }
        };
    }, []);


    const updateSelectOptions = (urls) => {
        const jspUrlInput = document.getElementById('url').value = urls[urls.length - 1]
        const select = document.getElementById('savedUrls');
        select.innerHTML = '';
        urls?.forEach(url => {
            const option = document.createElement('option');
            option.value = url;
            option.text = url;
            select.appendChild(option);
        });
    };


    const addUrl = () => {
        fetch('/UrlManagerAddUrl', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ url: currentUrl })
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`HTTP error! status: ${response.status}`);
                }
                setUrls(prevUrls => [...prevUrls, currentUrl]);
                resetInput();
                updateSelectOptions([...urls, currentUrl]);
                updateJspInputField(currentUrl); // update the JSP input field
            })
            .catch(error => {
                console.error('Error adding URL:', error);
            });
    };


    const updateUrl = (oldUrl, newUrl) => {
        fetch("/UrlManagerUpdateUrl", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ oldUrl, newUrl })
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`HTTP error! status: ${response.status}`);
                }
                setUrls(prevUrls => prevUrls.map(url => url === oldUrl ? newUrl : url));
                updateSelectOptions(prevUrls => prevUrls.map(url => url === oldUrl ? newUrl : url));
                updateJspInputField(newUrl); // update the JSP input field
            })
            .catch(error => {
                console.error('Error updating URL:', error);
            });
    };


    const deleteUrl = index => {
        const urlToDelete = urls[index];
        fetch('/UrlManagerDeleteUrl', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ url: urlToDelete })
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error(`HTTP error! status: ${response.status}`);
                }
                let newUrls = urls.filter((_, i) => i !== index);
                setUrls(newUrls);
                updateSelectOptions(newUrls);
                updateJspInputField(newUrls[0]); // update the JSP input field
            })
            .catch(error => {
                console.error('Error deleting URL:', error);
            });
    };

    const saveUrl = () => {
        if (currentUrl) {
            const oldUrl = urls[editingIndex];
            updateUrl(oldUrl, currentUrl);
            resetInput();
        }
    };

    const startEditing = index => {
        setCurrentUrl(urls[index]);
        setEditingIndex(index);
        setIsEditing(true);
    };

    const resetInput = () => {
        setCurrentUrl('');
        setEditingIndex(null);
        setIsEditing(false);
    };

    return (
        <>
            <h2>Saved URLs Manager</h2>
            <input
                className="form-control form-control-lg"
                type="text"
                value={currentUrl}
                onChange={(e) => setCurrentUrl(e.target.value)}
                placeholder="https://"
                aria-label="Url"
            />
            {isEditing ? (
                <button type="button" className="btn btn-primary btn-sm p-1 m-1" onClick={saveUrl}>Save</button>
            ) : (
                <button type="button" className="btn btn-primary btn-sm p-1 m-1" onClick={addUrl}>Add</button>
            )}
            {urls.map((url, index) => (
                <div key={index}>
                    {url}
                    <button type="button" className="btn btn-primary btn-sm p-1 m-1" onClick={() => startEditing(index)}>Edit</button>
                    <button type="button" className="btn btn-secondary btn-sm p-1 m-1" onClick={() => deleteUrl(index)}>Delete</button>
                </div>
            ))}
        </>
    );
}

export default SavedUrlsManager;