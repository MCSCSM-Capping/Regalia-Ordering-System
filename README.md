<!-- PROJECT REGALIA README
This README was created for the Project Regalia team for educational use. This README will not be updated past project completion (i.e. no further updates will be done post semester.)
README created by Anthony Rodriguez: anthony.rodriguez2@marist.edu 
-->

<a href="https://github.com/StevenBuglione/Regalia-Ordering-System/issues"><img alt="GitHub issues" src="https://img.shields.io/github/issues/StevenBuglione/Regalia-Ordering-System"></a> <a href="https://github.com/StevenBuglione/Regalia-Ordering-System/network"><img alt="GitHub forks" src="https://img.shields.io/github/forks/StevenBuglione/Regalia-Ordering-System"></a> <a href="https://github.com/StevenBuglione/Regalia-Ordering-System/stargazers"><img alt="GitHub stars" src="https://img.shields.io/github/stars/StevenBuglione/Regalia-Ordering-System"></a> <a href="https://github.com/StevenBuglione/Regalia-Ordering-System"><img alt="GitHub license" src="https://img.shields.io/github/license/StevenBuglione/Regalia-Ordering-System"></a>



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/StevenBuglione/Regalia-Ordering-System">
    <img src="images\ProjectRegalia.jpg" alt="Logo" width="500" height="200">
  </a>

  <h3 align="center">Regalia Ordering System</h3>

  <p align="center">
    README for the Marist College regalia ordering system. 
    <br />
    <a href="https://github.com/StevenBuglione/Regalia-Ordering-System/issues">Report Bug</a>
    ·
    <a href="https://github.com/StevenBuglione/Regalia-Ordering-System/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
  * [Deployed Using](#Deployed-Using)
  * [Services Used](#Services-Used)
  * [Code Explanation](#Code-Explanation)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
  * [How to run](#How-to-run)
  * [Server Setup Prior to Docker](#Server-Setup)
* [Docker](#Docker)
  * [Install Docker](#Install-Docker)
* [Installing Project Regalia](#Install-Project)
  * [Install Guide](#Install-Guide)
* [Usage](#usage)
* [Documentation](#Documentation)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

This project is being created and implemented to help Marist College create Regalia orders for their faculty. The aim of this task is to design an interface that helps facilitate ordering reglia via an updatable form that reminds designated admins of current preferences. 

This application aims to solve issues with the current reglia system:
* Tracking down faculty whom have not updated their preferences. 
* Keeping all relevant information in a single place for ease of use.
* Automate the ordering system. 
* Simplyfing the current system via a single login protocol. 

### Built With: 
Currently used software and frameworks:
* [Spring Framework](https://spring.io/projects/spring-framework)
* [Bootstrap](https://getbootstrap.com/)
* [MySql](https://www.mysql.com/)
* [Flyway](https://flywaydb.org/)
* [Super CSV](http://super-csv.github.io/super-csv/csv_specification.html)

### Deployed Using: 
* [Docker](https://www.docker.com/)

Why were these used?
* Maven in conjunction with Spring provides consistency across the project. With the help of added libraries and ease of use, it provided the best means of deploying a project of this scale quickly and efficiently.
* MySQL was chosen due to its wide range of compatible platforms. Since this project is intended to be injected into an already working network, last thing we want to be worried about is compatibility. 
* Flyway was used for ease of database migration and to make changes easily. 
* See [Docker Section](#Docker) for explanation. 

### Services Used
* [CAS](https://en.wikipedia.org/wiki/Central_Authentication_Service)
  * Requirement for security purposes. 

### Code Explanation
* Main : Within the src file we have our main function. Within this, we maintain Controllers, Models, DAO (Data Access Objects) and DTO (Data Transfer Objects). Like their namesake suggests, these are the means that we use to control certain elements of the app (pointing to specific files upon execution, error handling, etc.). Models are the constructs that hold vital information related to the pages being displayed as well as manipulating said information. DAO's are used to provide entry points into the database and provide a means to query the database for the correct information. The DTO is used to provide a blueprint for user creation and functions to return said user for use. 
* Resources : Here, we contain the database that has the relative information required for execution. Besides the script for the database, we also contain static resources such as JS script, images, css, etc. The templates feature HTML files that are used to structure the pages the user will see. The JS code in turn is reflected under the static/js folder that add important functionality with said HTML documents. CSS to make things look pretty :). 
* POM : These file contains the dependencies associated with the app. This is a good checklist to ensure what is needed to execute in the event there is an error on build. 
  * Workflow: Once the app is running and nagivating to localhost, user will be met with a CAS login screen. CAS simply interrupts the session and upon not locating a ticket will redirect to the CAS server for one. Once credentials are established, user is moved to user form to fill out information. Information placed into the form is then parsed by the controllers and user DTO for the relevant information to be stored which will be held in the database. The admin screen allows seeing the database and subsequent information posted. The Controllers and DTO/DOA allow for the query of particular users.  
    
      

<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.
  * Note: Upon opening the project on your IDE, you may be prompted to install the proper plugins and dependencies. Refer to the POM file for dependencies. 

### Prerequisites

The following are required for running the application locally: 
* [MySql](https://www.mysql.com/)


### Installation

1. Install the above software. 
    * Note: Ensure MySql is configured correctly (If an error is generated on build, CREATE or USE "Regalia-Ordering-System" database)
2. Clone the repo
```sh
git clone https://github.com/StevenBuglione/Regalia-Ordering-System.git
```

<!-- How to Start the program -->
### How to run
1. Ensure you have the most recent versions of the current stack. 
2. Open Command Prompt, relocate to the master directory and enter: 
``` sh
mvn spring-boot:run
``` 
3. The software will then begin to run. If using locally, ensure to use
the local port listed at towards the bottom of the generated report (i.e. port 8080/8081)<img src = "images\Example.PNG" alt ="Example"> 
    * Note: Ensure the MySql server is running during build-time. 

<!-- Server Setup Prior to Docker installation -->
### Server Setup
<b>Before Starting:</b> Ensure you are connected to the Marist College Network via VPN / using the network on Marist College campus. 

1. <b>Signing In:</b> 
  Visit capping.ecrl.marist.edu. Click advanced and then proceed. This should bring you to a VMware page. Cick HTML5 vsphere client. 
2. Sign in using the name that was given access to the ecrl vsphere (Ex. yourmaristemail@vsphere.local). The domain is vsphere.local. Then use the given password. It must be changed once inside. 
3. <b>Changing Password with Other Personal Information:</b> 
  Click menu -> Admin -> Users and Groups. Find your username. Click the Menu bar and then click Edit. Then change the current password. Click Ok. 
4. <b>Creating the VM:</b> 
  Click Menu -> Hosts and Clusters -> VMs and Templates. Click the dropdown until you see your folder. In the folder: click Actions -> New Virtual Machine. 
5. Click Create Virtual Machine and then Next.
6. Name the VM to a relevant to your project with the desired IP address for the server (for ease of identification, the IP's you will be using will be given). Ensure it's selected in your team folder. Then Next. 
7. Click Capping Cluster Resources then Next. 
8. Click Current Capping then Next. 
9. Ensure compatibility is ESXI 6.5 then Next. 
10. Choose the OS for the server then Next. 
11. <b>Hardware:</b> 
  * CPU - 4 cores and 4 cores per socket. This means you have 1 processor with 4 cores verses 4 processors with 1 core.
  * Memory (RAM) - 4 GB.
  * Hard Drive (New Hard Disk) - 16 GB. Ensure it's on Thin Provisioned. 
  * Network (New Network) - 10.10.9.0/24
  * Mounting the ISO (New CD/DVD Drive) - click Datastore ISO -> ISO - Repo -> click on the folder for the chosen OS. Click OK. Click the checkbox to ensure it connects when powered on. 
  * Next and then Finish. 
  * To edit when VM is off: Right click on VM and then Edit. 
12. <b>The VM and Installing CentOS:</b> 
  Click the green arrow towards the top to power on OR click on Actions and then Power On. Click Launch Web Console. Ensure the popup is checked on the Web Console and click OK. The VM will launch on a new tab. 
13. Ensure you are on Intall CentOS 7 and hit Enter. Wait for the installation to complete. A prompt will appear to select a language. Hit Continue. 
14. Ensure you are selecting the Select Disk under System and Installation Destination. Use Minimal Install (specific for CentOS) under Software and Software Selection. 
15. <b>Configuring the Network:</b> 
  Click Network and Hostname -> Configure -> IPv4 Settings -> Method = Manual -> Add. 
  * Our Projects Info: 
  Address(Server IP): 10.10.9.150   Netmask: 24   Gateway: 10.10.9.1
  DNS: 10.11.12.2, 10.11.12.3
      Then save. Enable Ethernet Connectivity.
      You can create a Hostname if desired. Ours is Linux Docker Container.
16. Click Begin Installation. 
17. You will be prompted to create a Root username and password as well as an admin user. Ensure you complete those before completing the installation. The server should boot and then you will be prompted to sign into the server. Use the admin user info created. You should then be within the terminal of the newly created Virtual Machine.   

<!-- Docker Install Guide -->
## Docker
Why Docker?
* Docker is software that provides the ability to package and run and application in a loosely isloated environment called a container. The isolation and security allow you to run many containers simultaneously on a given host. Quoted from Docker's [website](https://docs.docker.com/get-started/overview/).

### Install Docker
1. Install the latest version of Docker:
```sh
$ sudo yum install docker-ce docer-ce-cli containerd.io
```
<i>Sudo</i> is the command that allows the user root access. If you simply type the command <i>su</i>, it will prompt you to log into the root user so you don't have to type <i>sudo</i> every time. <i>Sudo</i> also helps with running docker commands.

2. Start Docker
```sh
$ sudo systemctl start docker
```
3. Check to see if docker is running properly by running a <i>hello world</i> image. It created an image and runs on a container that prints an informational message to you. 
```sh
$ sudo docker run hello-world
```

<!-- Application Installation -->
## Install Project
Use the below guide to install the application. This must be done AFTER the above steps have been taken. 

### Install Guide
1. Login
```sh
Login to rsantiag@10.10.9.150
Password: Regalia20
```
2. Enter Super User Mode
```sh
[rsantiago@Linux-Docker-Container ~]$ su
Password: Regalia20
```
3. Login to Docker
```sh
[root@Linux-Docker-Container rsantiago]# docker login
```
* Follow the prompted steps to login to docker account.
4. Pull the required docker images from the docker hub. 
```sh
[root@Linux-Docker-Container rsantiago]# docker pull stevebuglione/regalia-mysql-image
[root@Linux-Docker-Container rsantiago]# docker pull stevebuglione/regalia-spring-image
```
5. Verify that the images have been installed locally.
```sh
[root@Linux-Docker-Container rsantiago]# docker images
```
* Example Output: 
```sh
        REPOSITORY                       TAG       IMAGE ID         CREATED         SIZE
stevenbuglione/regalia-mysql-image     latest    440b7b5f9a3f     20 minutes ago    545MB
stevebuglione/regalia-spring-image     latest    b498ad1bddb9     18 hours ago      684MB  
```
6. Run the stevebuglione/regalia-mysql-image as a container
```sh
[root@Linux-Docker-Container rsantiago]# docker run --name regalia-mysql -p 3307:3306 -d stevebuglione/regalia-mysql-image
```
7. Verify the container is up and running.
```sh
[root@Linux-Docker-Container rsantiago]# docker ps
```
* Example Output: 
```sh
CONTAINER ID        IMAGE                               COMMAND                  CREATED           STATUS                 PORTS                               NAMES
39c8c4f6e85a   stevebuglione/regalia-mysql-image   "docker-entrypoint.s…"     2 seconds ago       Up 1 second     33060/tcp, 0.0.0.0:3307->3306/tcp       regalia-mysql
```
8. Run stevebuglione/regalia-spring-image as a container and link it to the regalia-mysql container.
```sh
[root@Linux-Docker-Container rsantiago]# docker run -p 443:8443 --name regalia-spring --link regalia-mysql:mysql -d stevebuglione/regalia-spring-image
```
9. Verify both containers are up and running.
```sh
[root@Linux-Docker-Container rsantiago]# docker ps
```
* Example Output:
```sh
CONTAINER ID               IMAGE                             COMMAND                CREATED            STATUS                     PORTS                       NAMES
6bef714371b9     stevebuglione/regalia-spring-image   "java -jar regalia.j…"      3 seconds ago      Up 2 seconds         0.0.0.0:80->80/tcp, 8080/tcp     regalia-spring
39c8c4f6e85a     stevebuglione/regalia-mysql-image    "docker-entrypoint.s…"   About a minute ago   Up About a minute   33060/tcp, 0.0.0.0:3307->3306/tcp  regalia-mysql
```
10. Verify the application is accessible online. 
```sh
Visit: 10.10.9.150
     : https://regalia.capping.ecrl.marist.edu
```
11. You have successfully deployed the Regalia Ordering System application from Docker. 

<!-- USAGE EXAMPLES -->
## Usage

This project is intended for the private use of Marist College. The programming and systems involved are tailored for the college and any use other than intended will result in unforeseen problems and troubleshooting. The authors of this application assume no responsibility for unauthorized use. Any code pertaining to Marist College must be replaced if to be used for other institutions and thereby no longer under this project's domain. 

<!-- DOCUMENTATION -->
## Documentation
The following are documents related to the construction of the application. 

[Architectural Diagram](https://github.com/StevenBuglione/Regalia-Ordering-System/tree/arod/Documents) 


<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/StevenBuglione/Regalia-Ordering-System/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Follow instructions below to create a fork. 

 **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Techlead: Steven Buglione - steven.buglione1@marist.edu

Our Team: 
* Programming : Anton Kochnev - anton.kochnev1@marist.edu
* Project Communications: Max Wasserfall - max.wasserfall1@marist.edu
* Information Tech.: Raymond Santiago - raymond.santiago2@marist.edu
* Programming: Anthony Rodriguez - anthony.rodriguez2@marist.edu


Project Link: [https://github.com/StevenBuglione/Regalia-Ordering-System](https://github.com/StevenBuglione/Regalia-Ordering-System)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)
* [Animate.css](https://daneden.github.io/animate.css)
* [Loaders.css](https://connoratherton.com/loaders)
* [Slick Carousel](https://kenwheeler.github.io/slick)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)
* [Sticky Kit](http://leafo.net/sticky-kit)
* [JVectorMap](http://jvectormap.com)
* [Font Awesome](https://fontawesome.com)





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=flat-square
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=flat-square
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=flat-square
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=flat-square
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=flat-square
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png

Additonal Resources:
>'https://angular.io/'

>'https://docs.microsoft.com/en-us/aspnet/core/introduction-to-aspnet-core?view=aspnetcore-3.1'

>'https://apereo.github.io/cas/4.2.x/protocol/CAS-Protocol.html'

>'https://iam.harvard.edu/resources/cas-integration'

>'https://docs.microsoft.com/en-us/aspnet/core/data/entity-framework-6?view=aspnetcore-3.1'

>'https://docs.microsoft.com/en-us/aspnet/core/data/ef-mvc/intro?view=aspnetcore-3.1'

>'https://app.lucidchart.com/documents/edit/9f3bc75f-50ca-4b0f-8ef6-2c42177f211e/0_0?beaconFlowId=40E049242CD471F5'

>'https://auth0.com/docs/tokens/json-web-tokens'

>'https://www.docker.com/'

>'https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/concepts/linq/'

>'https://github.com/StevenBuglione/Dating-App'

>'https://chsakell.com/2018/04/28/asp-net-core-identity-series-getting-started/'
