# springcavaj-designpattern

# Abstract Factory - Creational Desing Pattern

## A good understanding of the usage of AbstractFactory Design Pattern

### Software Required
* [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)
* [Spring tool Suite](https://spring.io/tools) or [Eclipse](https://www.eclipse.org/downloads/packages/)
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git Bash](https://git-scm.com/downloads)

### Steps to clone and run the application
* Open Git Bash or even you can open Command Prompt (if you are using Windows) or Terminal (if you are using MAC) in your machine
* Clone the application from github.com as   
<code>git clone https://github.com/c86amik/spring-rest-masterclass.git</code>
* Open either <strong>STS</strong> or <strong>Eclipse</strong> and import the application as <strong>Maven</strong> project
* After the application got successfully imported in either <strong>STS</strong> or <strong>Eclipse</strong>
* Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>
* The application will start in the port <strong>7113</strong>
* Open the Postman and test the REST Endpoints

### Testing using Postman
<ol>
<li><strong>Get All Movies</strong> - localhost:7113/allMovies</li>
<li><strong>Get Movie by Name</strong> - localhost:7113/findMovieByName/{name}</li>
<li><strong>Get all Movies by Release Year</strong> - localhost:7113/findMoviesByYear/{year}
<li><strong>Save a Movie</strong> - localhost:7113/saveMovie</li>
<li><strong>Update a Movie</strong> - localhost:7113/updateMovie/{name}</li>
<li><strong>Delete a Movie</strong> - localhost:7113/deleteMovie/{name}</li>
</ol>

#### Dummy JSON object
* Body for the <strong>POST</strong> Method   
<code>{
	"name" : "Movie Name",
	"releaseYear" : "2022",
	"rating" : "9.8",
	"actors" : [ "Actor", "Actress", "Villain" ]
	"director" : "Director",
	"producer" : "Producer"
}</code>
* Body for the <strong>PUT</strong> method
<code>{
	"name" : "Movie Name",
	"releaseYear" : "2022",
	"rating" : "9.8",
	"actors" : [ "Actor", "Actress", "Villain" ]
	"director" : "Director",
	"producer" : "Producer"
}</code>