<!--
*** Thanks for checking out this README Template. If you have a suggestion that would
*** make this better, please fork the repo and create a pull request or simply open
*** an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->





<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
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
  * [Services Used](#Services-Used)
  * [Code Explanation](#Code-Explanation)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
  * [How to run](#How-to-run)
* [Docker](#Docker)
  * [Install Guide](#Install-Guide)
* [Usage](#usage)
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

### Built With
Currently used software and frameworks:
* [Spring Framework](https://spring.io/projects/spring-framework)
* [Bootstrap](https://getbootstrap.com/)
* [MySql](https://www.mysql.com/)
* [Flyway](https://flywaydb.org/)
* [Super CSV](http://super-csv.github.io/super-csv/csv_specification.html)

* Why were these used?
  * Maven in conjunction with Spring provides consistency across the project. With the help of added libraries and ease of use, it provided the best means of deploying a project of this scale quickly and efficiently.
  * MySQL was chosen due to its wide range of compatible platforms. Since this project is intended to be injected into an already working network, last thing we want to be worried about is compatibility. 
  * Flyway was used for ease of database migration and to make changes easily. 

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


<!-- Docker Install Guide -->
## Docker

Docker is software that provides the ability to package and run and application in a loosely isloated environment called a container. The isolation and security allow you to run many containers simultaneously on a given host. Quoted from (https://docs.docker.com/get-started/overview/)

<!-- USAGE EXAMPLES -->
## Usage

This project is intended for the private use of Marist College. The programming and systems involved are tailored for the college and any use other than intended will result in unforeseen problems and troubleshooting. The authors of this application assume no responsibility for unauthorized use. Any code pertaining to Marist College must be replaced if to be used for other institutions and thereby no longer under this project's domain. 



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
