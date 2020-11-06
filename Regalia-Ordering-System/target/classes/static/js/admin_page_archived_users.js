function getUserCwid(user){

        let username = user;
        let ModalUsername = document.getElementById("modelCwidValue");
        ModalUsername.attribute = username;
        ModalUsername.textContent = username;

}

function postRestoreUser(){
    const route = 'http://localhost:8080/user/restore/';
    let id = document.getElementById("modelCwidValue").textContent;
    let url = route + id;
    // request options
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    }

    // send POST request
    fetch(url, options)
        .then(res => res.json())
        .then(res => console.log(res));


  window.location.href = "/admin_page_archived_users"
}