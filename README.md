local repo project name=spring_core_github
A simple program to show how to inject dependencies in spring.

How to create program=
i)add spring dependencies in pom.xml
ii)create configuration file in resources folder.

Structure of project-:

i)Module1(singleClassDependencies)=A simple student class class having only instance variable of primitive data type only.Creating object of Student using Spring IOC container.

ii)Module2(multipleClassDependencies)=A simple student class which has instance variables City and State which itself are classes.Creating object of Student usng ref tag.

iii)Module 3(multipleClassDependenciesUsingAnnotations)=same as Module 2, this time we dont have to use ref tag , but we have to apply @Autowired annotation above State and City and dont forget to enable anootation in configuration file.


