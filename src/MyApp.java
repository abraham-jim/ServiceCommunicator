public class MyApp {
    public static void main (String[] argv) {
        java.util.Scanner userinput;

        while (true) {
            System.out.print("Command> ");
            userinput = new java.util.Scanner(System.in);
            String cmd = userinput.next();
            System.out.println("You selected " + cmd + ".");
        }
    }
}

/*

 TODO: Go to Github and download the zip file from the repo CodingBasicsProject5.  This zip just contains two small Java files.
      Create a new Git repo with these files.  If you have any trouble, ask your tutor or instructor for assistance.

 TODO :The zip file contain two Java files:  ServiceCommunicator.java and MyApp.java Load them into IntelliJ.
      Notice each file has a main() routine.  As you recall, when you start a Java class,
      the main() method in that class is where execution begins.  Let’s ignore MyApp.java for the time being.



 TODO: Build ServiceCommunicator.java using IntelliJ.   Run ServiceCommunicator and test it.  Notice the test uses the zipcode service
     that we described earlier.  Make sure you get results from the web (and make sure you’re connected to the Internet!).
     If not, contact your tutor or instructor for assistance.When the constructor to ServiceCommunicator is called in the main() method,
      notice we are using a URL string.

TODO:   Design and create a new class called Zipcode that has a constructor that accepts only the target zipcode, ie, not a URL.
       Notice all the work to connect to a service is already in the class ServiceCommunicator (in its constructor and get() method).
      Use object-oriented thinking and avoid duplicating any code from ServiceCommunicator as you create your Zipcode.java class.
       Create a main() in your Zipcode class that tests your constructor similar to the main() in ServiceCommunicator.

TODO:  Now let’s add a class that retrieves information about TV shows.  Here’s the URL to retrieve music information from that service:

            http://api.tvmaze.com/singlesearch/shows?q=SEARCHSEARCH is the TV show name or episode you want to use.

TODO:   Create a Television class similar to Zipcode that passes the tv show name to the constructor.
       Create a main() in your Television class that tests your constructor similar to the main() in ServiceCommunicator.
       If your SEARCH term has spaces, use hyphens instead of spaces.


TODO:  Now let’s add a very similar class that retrieves information about music.
        Here’s the URL to retrieve music information from iTunes:
        https://itunes.apple.com/search?term=SEARCH&limit=1 SEARCH is the song title or artist name that you want to use.

 TODO:   Create a Music class similar to Zipcode that passes the song title or artist name to the constructor.
          Create a main() in your Music class that tests your constructor similar to the main() in ServiceCommunicator.
          If your SEARCH term has spaces, use hyphens instead of spaces.

TODO:   Now commit and push your working code to your repo.  Confirm your repo exists by visiting Github.com with a browser and inspecting
        your repos.  Awesome!  At this point, you have constructed tools to access information services on the web without a browser!


Challenge Problem

Use Qooper to find another partner team or another programmer that you can swap repos.

Using Intellij, create a brand new Project from Version Control.  Select Github.  Use the name of the other Github repository
 from the other team (the other team will create their new Project using your repo) and clone it.  Once the project is created and
  you see the source code files, make sure all the classes in your new Project build and run.

Now let’s add a simple user interface that uses the classes from the other team.  In your project you should have MyApp.java.
 Let’s first build this class just to make sure it runs.

 Modify MyApp.java to call the appropriate TV, Music and Zipcode functionality based on what the user wanted.  For example:


Command> music bob-marley-and-the-wailers	# use hyphens instead of spaces
… info on bob-marley-and-the-wailers from the Music service...

Command> tv star-trek
… info on star-trek from the Television service...

Don’t forget to add error checking to let your users know when they entered an incorrect command.  You may even want to have
 a ‘help’ command that tells your users what commands are available.

Command> info
	Info is not a valid command.

Command> quit
Thank you for using Search Tool!


Extra Challenge Problem

Add a new service that calls the Wikipedia service.  Here’s the URL to retrieve music information from Wikipedia:

https://en.wikipedia.org/w/api.php?action=query&list=search&srsearch=SEARCH&format=json

SEARCH is the Wikipedia term that you want to use.  Create a Wiki class similar to Zipcode that passes your search term to
 the constructor.  Create a main() in your Wiki class that tests your constructor similar to the main() in ServiceCommunicator.
  If your SEARCH term has spaces, use hyphens instead of spaces.

Add a new command “wiki” to MyApp.java that calls your new Wiki class with a search term.

...
Command> wiki sundar-pichai
… info on sundar-pichai from the Wikipedia service…


Submit a Git pull request to submit your new Wiki class contribution to the new repo.  Hopefully the other team likes your
 changes and accepts them!


Really, Really Challenging Problem

Notice the verbose output, while readable, is formatted in an odd way.  This type of data format is called JSON,
which is a standard format of exchanging data between two systems.  JSON stands for “JavaScript Object Notation”,
because it was originally invented for JavaScript, but it really can be used by any computer language.
 JSON-formatted data is great for exchanging data among machines, but it's usually not the best way to show data to your users.

See if you can find a JSON library for Java (and some documentation on that library would help too!) on the web.
  Download the library and incorporate it into your information service app.  Now change the output so it's much more
   readable for your users.

It’s always good to have happy users!
*/
