# springcavaj-designpattern

# Database backed Singleton - Singleton Design Pattern

## A good understanding of the usage of Database-backed Singleton Design Pattern

### Steps to run the application
* Install MySQL. Complete installation steps of [MySQL Workbench](https://www.sqlshack.com/how-to-install-mysql-database-server-8-0-19-on-windows-10/) are provided
* If you face any problem while installing MySQL Workbench, then you can install SQLYog as mentioned in the Software Required steps
* After installing the MySQL search in the Start command with MySQL and you will found the MySQL Command Line Client.
* Hit the Enter button it will open a Command Prompt and opt for password.
* Provide the password MySQL Server will get connected.
* Now run the <strong>create_table.sql</strong> file in any MySQL Client.
* It will create the table named as <strong>single_instance</strong> where we will test the Database backed Singleton Design Pattern.
* Import the application from GitHub Link.
* After successfully importing the application either in <strong>Eclipse</strong> or <strong>STS</strong>.
* Right click on the class named as DatabaseBackedSingletonMasterclassApplication.java.
* Select the <strong>Run As</strong> option and <strong>Java Application</strong>.
* Application will run successfully and will produce the desired output as provided below.

### Console output
INFO com.springcavaj.designpattern.singleton.database.DatabaseBackedSingletonMasterclassApplication - Initial Data: Database Driven Singleton in Distributed Systems.

INFO com.springcavaj.designpattern.singleton.database.DatabaseBackedSingletonMasterclassApplication - Updated Data: Updated Singleton Data in Distributed Systems.
