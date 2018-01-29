       _      _               _     ___     _   
 /\   /(_)_ __| |_ _   _  __ _| |   / _ \___| |_ 
 \ \ / / | '__| __| | | |/ _` | |  / /_)/ _ \ __|
  \ V /| | |  | |_| |_| | (_| | | / ___/  __/ |_ 
   \_/ |_|_|   \__|\__,_|\__,_|_| \/    \___|\__|
                                                 
  _          __      _____ ___ ___   ___         _         _       _        
 | |__ _  _  \ \    / / __/ __|_ _| |_ _|_ _  __| |_  _ __| |_ _ _(_)___ ___
 | '_ \ || |  \ \/\/ / (_| (__ | |   | || ' \/ _` | || (_-<  _| '_| / -_|_-<
 |_.__/\_, |   \_/\_/ \___\___|___| |___|_||_\__,_|\_,_/__/\__|_| |_\___/__/
       |__/                                                                 

Weekend Assignment for WeCanCodeIT, an accelerated educational experince provider.  This is our second week project focusing on class design and incorporating TDD into the development of the app.

Project Requirements

	Setup
	[ * ] In Git Bash mkdir virtual-pet.
	[ * ] cd into the virtual-pet directory
	[ * ] copy and paste curl https://raw.githubusercontent.com/WeCanCodeIT/gradle-scripts/master/basic-junit/build.gradle --output build.gradle
	[ * ] type ls to make sure that you see a build.gradle inside of virtual-pet
	[ * ] type gradle eclipse to finish set up of your project in bash
	[ * ] in Eclipse, import existing project into workspace
	[ * ] Create a README.md file in your project folder to describe what you’ve done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you’d like to learn more about Markdown formatting, check out the Github Markdown Guide.)
	[ * ] Create a GitHub repository also named virtual-pet and set it up so that you can push your code there from your Eclipse project. Do this now. It’s the least fun part, so just get it out of the way.

	Classes
	[ * ] create a VirtualPet class.
	[ * ] create a VirtualPetApp class with a main method.
	[ * ] Stretch goal create a VirtualPetTest class to build out unit tests on the behaviors placed in VirtualPet
	[ * ] You should house your project in a properly named package…something other than the default package


	Required Tasks
	[ * ] VirtualPet class
		[ * ] Create a tick() method that represents the passage of time.
		[ * ] Create at least three instance variables (aka attributes aka properties aka fields).
		[ * ] Create at least three methods (messages you send to your pet).
	[ * ] VirtualPetApp class
		[ * ] Create a main method that…
			[ * ] implements a game loop.
			[ * ] asks for user input.
			[ * ] writes output to the console.
	
Grading

		Category				Max Score
	[ * ]	tick() method				12
	[ * ]	first instance variable			8
	[ * ]	second VirtualPet instance variable	8
	[ * ]	third VirtualPet instance variable	8
	[ * ]	first VirtualPet method			8
	[ * ]	second VirtualPet method		8
	[ * ]	third VirtualPet method			8
	[ * ]	implement game loop			12
	[ * ]	ask for user input			9
	[ * ]	write output to the console		9
	[ ]	style/formatting/code quality		10

Details
The project asks to create a virtual pet application akin to the Tamagotchi or DigiPet.  We were tasked to create a virtual pet class and load it with instance variables and methods.  We were also asked to create a game loop in the main method to represent the passing of time.  The exit for the loop in my project is when the needs of the pet hit critical levels and bad things happen to them.  The method that facilitates the passing of time is the tick() method that increments all needs by a set value everytime a game action is executed.




Virtual Pet Attributes

[ ] hunger (feed it)
[ ] thirst (water it)
[ ] boredom (play with it)
[ ] tiredness (take it to the doctor)

Virtual Pet Actions

[ * ] Feed Pet
[ * ] Water Pet
[ * ] Play With Pet
[ * ] Let Pet Nap
[ * ] Do nothing



ASCII Art
      /\,_/\
      /==_ ( 
     (Y_.) /       /// 
      U ) (__,_____) ) 
        )'   >     `/ 
        |._  _____  | 
        | | (    \| ( 
        | | |    || | 
   ,,-. ),)_/ ., ))_/,,.-,_