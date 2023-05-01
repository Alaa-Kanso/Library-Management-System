<h1>Library Management System</h1>
This project is a library management system that allows users, librarians, and administrators to interact with a collection of books. The system is built using JavaFX and FXML, and it implements several design patterns, including MVC, composite, proxy, iterator, and observer.

<h2>Features</h2>
The library management system has the following features:

<h3>User</h3>
<ul>
<li>Browse all books available</li>
<li>Borrow books</li>
<li>Filter books by author name, length, and genre</li>
<li>Search for books by name</li>
<li>Be notified when new books are added to the library</li>
<li>See the books they have borrowed</li>
<li>Return books</li>
</ul>
<h3>Librarian</h3>
<ul>
<li>Add new books to the library</li>
<li>Browse the list of users who have borrowed books they added</li>
</ul>
<h3>Admin</h3>
<ul>
<li>Add new librarians</li>
<li>View details of all librarians in the system</li>
<li>Remove librarians from the system</li>
</ul>
<h2>Installation</h2>
<h3>Prerequisites</h3>
<ul>
<li>Java 8 or higher</li>
<li>MySQL installed on your machine</li>
<li>Access to a MySQL server instance (either locally or remotely) with a username and password</li>
</ul>
<h3>Setup</h3>
<ul>
<li>Create a new database named <b>guiproject</b> in your MySQL server instance. You can do this by running the following command in the MySQL shell or a MySQL client tool:
<br><br>
<code>CREATE DATABASE guiproject;</code>
<br><br>
</li>
<li>Set the username and password of your MySQL user account in the getConnection() method in the Database.java file. This is necessary to establish a connection to the database. Replace the <b>USERNAME_HERE</b> and <b>PASSWORD_HERE</b> placeholders with your actual username and password:
<br><br>
<code>Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/guiproject", "USERNAME_HERE", "PASSWORD_HERE");</code>
<br><br>
</li>
<li>Run the application by running the Main class. As soon as you run the application, it will automatically create the necessary tables (users1, books, messages, and borrows) in the guiproject database if they don't already exist.</li>
That's it! Once you have completed these steps, you should be able to use the library management system to manage your collection of books.

<h2>Usage</h2>
When you first run the library management system, you will be prompted to log in as a user, librarian, or admin. Depending on the role you choose, you will be able to perform different actions in the system.

If you log in as a user, you can browse and borrow books, as well as filter and search for books. You will also be notified when new books are added to the library, and you can see the books you have borrowed and return them when you are done.

If you log in as a librarian, you can add new books to the library, as well as view the list of users who have borrowed books.

If you log in as an admin, you can add new librarians, view details of all librarians in the system, and remove librarians from the system.

<h2>Credits</h2>
This project was created by:
<ul>
<li>Alaa Kanso - alaakanso120@gmail.com</li>
<li>Mustafa Radi - moustafaradi423@gmail.com</li>
<li>Mohammad Itani - king.itani.109@gmail.com</li>
<li>Hamza Hamadi - hamzahamadi296@gmail.com</li>
</ul>
<br>
We would like to acknowledge the following resources that helped us develop the library management system:
<ul>
<li>JavaFX documentation</li>
<li>FXML documentation</li>
<li>Head First Design Patterns book</li>
<li>Oracle JDBC documentation</li>
<li>Stack Overflow and GitHub for community support</li>
<li>ChatGPT for providing guidance when the team encountered difficult problems</li>
</ul>
