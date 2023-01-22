<body class="c14 doc-content">
   <div>
      <p class="c9 c17"><span class="c8"></span></p>
   </div>
   <h2 class="c15" id="h.c8wzppfj0k8y"><span class="c11 c6">The Key Concepts</span></h2>
   <h3 class="c1" id="h.9af47ijwgyna"><span class="c2">Classes &amp; Objects</span></h3>
   <p class="c0"><span>A class is a </span><span class="c6">template </span><span>from which objects can be </span><span class="c6">instantiated</span><span class="c4">. Classes represent real life concepts such as cars or houses and objects are individual instances created of those pre-defined class “templates”.<br></span></p>
   <p class="c0"><span>Classes consist of </span><span class="c6">states </span><span>(attributes) and </span><span class="c6">behaviors </span><span class="c4">(methods). Objects are instances of a class and they have attributes which are stored using variables and have methods stored implemented as functions that can operate on the data.</span></p>
   <h3 class="c1" id="h.iak1sp1k3y6u"><span class="c2">Constructor</span></h3>
   <p class="c5"><span>A function that most classes contain which gets </span><span class="c6">automatically called</span><span>&nbsp;when an object is </span><span class="c6">instantiated </span><span>from a class. Used to </span><span class="c6">initialize default values </span><span class="c4">for the object’s attributes.</span></p>
   <h3 class="c1" id="h.x871gqnz12gs"><span class="c2">Inheritance</span></h3>
   <p class="c0"><span>The relationship between classes provides a way of </span><span class="c6">categorizing classes</span><span class="c4">&nbsp;and making organizing code in complex programs a more efficient and effective task.</span></p>
   <h3 class="c1" id="h.me14pzevgfqp"><span class="c2">Encapsulation</span></h3>
   <p class="c0"><span>The definition of methods and attributes of a class as either </span><span class="c6">private </span><span>or </span><span class="c6">public</span><span class="c4">.</span></p>
   <p class="c0 c9"><span class="c4"></span></p>
   <p class="c0"><span class="c6">Private </span><span>methods/attributes can </span><span class="c6">only be accessed</span><span class="c4">&nbsp;from methods in the class making them more secure. </span></p>
   <p class="c0 c9"><span class="c6 c12"></span></p>
   <p class="c0"><span class="c6">Public </span><span>methods/attributes are </span><span class="c6">able to be accessed from anywhere</span><span>&nbsp;in the program.</span></p>
   <h3 class="c1" id="h.mygbyvdtjqgq"><span class="c2">Polymorphism</span></h3>
   <p class="c0"><span>Meaning </span><span class="c6">“multiple forms”</span><span>. In OOP multiple forms can be used for the same method. The same </span><span class="c6">method name</span><span>&nbsp;can be used as long as there are </span><span class="c6">different parameters</span><span class="c4">.</span></p>
   <h4 class="c3" id="h.n8kd2n72jap3"><span class="c6 c7">Over-riding</span><span style="overflow: hidden; display: inline-block; margin: 0.00px 0.00px; border: 0.00px solid #000000; transform: rotate(0.00rad) translateZ(0px); -webkit-transform: rotate(0.00rad) translateZ(0px); width: 296.70px; height: 200.00px;">
   <p class="c5"><span>Taking cars as an example. Both cars </span><span class="c6">inherit </span><span>the drive() method from the parent class, Car. Taking into account the real life concepts of both objects the driving method will have to be different for both electric cars and petrol cars to not drive the same way in real life. Both methods will be different and they will </span><span class="c6">overwrite the code of the parent class</span><span>. This is why it is called </span><span class="c6">override polymorphism</span><span>. A method from a subclass needs to be overwritten to override a method inherited from the parent class. Parent class methods can be defined but be empty functions that are only going to be properly implemented into subclasses.</span></p>
   <h4 class="c3" id="h.6ywvlv83ypmp"><span class="c7 c6">Overloading</span></h4>
   <p class="c0"><span>Having </span><span class="c6">multiple implementations </span><span class="c4">of the same method which accepts different parameters. The method can have the same name as one that uses an integer as a parameter but use a string instead and perform something completely different.</span></p>
   <h3 class="c1" id="h.bkajla4mn1wd"><span class="c2">Abstract Classes</span></h3>
   <p class="c5"><span>A class that will </span><span class="c6">never </span><span>be used to </span><span class="c6">instantiate objects directly</span><span class="c4">. The purpose of an abstract class is to create a parent class that sub-classes will inherit from and then instantiate objects.</span></p>
   <h2 class="c15" id="h.2e9wx4yk188k"><span class="c6 c11">Superhero Class</span></h2>
   <p class="c5"><span>In this case, we will take a superhero as a class and </span><span class="c6">test to see if the class is working </span><span class="c4">by creating objects of individual superheroes with superpowers and strengths.</span></p>
   <h3 class="c1" id="h.z7hnjysvy38t"><span class="c2">Attributes</span></h3>
   <ul class="c10 lst-kix_t7epf5sdyiws-0 start">
      <li class="c5 c13 li-bullet-0"><span class="c4">name (String)</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">superpower (String)</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">strength (Integer)</span></li>
   </ul>
   <h3 class="c1" id="h.op36vhwq6f06"><span class="c2">Methods</span></h3>
   <p class="c5"><span>Some methods of a superhero are:</span></p>
   <ul class="c10 lst-kix_fw3stmreyewv-0 start">
      <li class="c5 c13 li-bullet-0"><span class="c4">init() - constructor method</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">walk()</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">run()</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">jump()</span></li>
   </ul>
   <p class="c5 c9"><span class="c4"></span></p>
   <p class="c5"><span>More methods can be added later during the </span><span class="c6">coding of the Superhero</span><span class="c4">&nbsp;class.</span></p>
   <h3 class="c1" id="h.8hn7kzb2q771"><span class="c2">Objects</span></h3>
   <ul class="c10 lst-kix_rmy6jokef3ak-0 start">
      <li class="c5 c13 li-bullet-0"><span class="c4">Spiderman</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">Superman</span></li>
      <li class="c5 c13 li-bullet-0"><span class="c4">Batman</span></li>
   </ul>

</body>
