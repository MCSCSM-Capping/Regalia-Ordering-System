function getUserCwid(user){
        //Getting form data and storing it in block scope variables
        let username = user;

        console.log(username);

        //Set the form Data with the users CWID
        let ModalUsername = document.getElementById("modelCwidValue");

        ModalUsername.attribute = username;

        ModalUsername.textContent = username;

}

function postRestoreUser(){


    const url = 'http://localhost:8080/restore';

    let usersCwid = document.getElementById("modelCwidValue").textContent;

    // post body data
    const user = {
        username: usersCwid
    };

    console.log(user);

    // request options
    const options = {
        method: 'POST',
        body: JSON.stringify(user),
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