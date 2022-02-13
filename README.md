# Utvecklingsverktyg-Project-Grupp4
 
A simple collection Program.
supporting Books, Games and Movies.
U can add, remove or check for what alredy exists in the current in the collecction
 
How to build

First way - Eclipse

1. Copy the repo or download it with either in the website, cmd or Github Desktop. the main priorty is getting the project somewhere on your copmuter
2. Open Eclipse
3. Click "import a projects" under the package explorer tab
4. Choose existing maven project
5. Then browse the root directory and select ur cloned repoistory and make sure the "pom.xml" is checkmarked and click finish
6. Now u should have all the files under the package Explorer tab
7. Right click pom.xml and choose : Run as -> Maven Install
8. Then ur project will get build with a jar file and a javadoc in the target folder of the copied project

Second way - Jenkins

1. Make sure u have Jenkins version working and running either through install or with "java -jar jenkins.war"
2. Setup Jenkins so it works for your computer
This means setting up JDK, Git and Maven. For this project we will be using java 11 and maven 3.3.9 (maven339)
3. Click "Add new Item" and choose "Freestyle Proejct" give resonable name and click ok
4. Choose "Git" Under "Source code management" and copy this repo link into the box
5. Under "Branch specifier" change it to "*/main"
6. Choose ur maven version under "build"
7. add build step "Invoke top level maven-targets" and click Save
8. and type "clean package" in the box and then click build
9. Then click "Build Now"
10. Then u should have the project compiled on ur computer in ur ".jenkins" folder located at home.
11. The files should include all the code and a javadoc and 2 jar files.

Documentation 

Check the javadoc that comes with this project after builiding
if u go in folder target -> apidocs u should see all some folders and a bunch of htmls
with the documentation
