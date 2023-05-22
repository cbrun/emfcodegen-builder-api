# A tiny code generator to produce a Java "Builder" and fluent API from Ecore models

## What can I use this for ?

To code the creation of a model instance leveraging your Java and your IDE, in a dense way.

Example, here applied on the Sirius Web views model to describe a form editor:

```java
	 public FormDescription formWithstatsOfTheCompleteBiblioGraphy = this.m.newFormDescription()
	            .name("Biblio stats")
	            .domainType(this.m.asDomainType(BiblioPackage.eINSTANCE.getBiblio()))
	            .groups(this.m.newGroupDescription()
	                    .name("Global stats")
	                    .displayMode(GroupDisplayMode.LIST)
	                    .semanticCandidatesExpression(this.m.asAQL("self"))
	                    .widgets(this.m.newLabelDescription()
	                            .name("nb publications")
	                            .labelExpression(this.m.asAQL("'number of publications:' + self.eAllContents(biblio::Publication)->size()"))
	                            .style(this.m.newLabelDescriptionStyle()
	                                    .bold(true)
	                                    .build())
	                            .build() ,
	                            this.m.newBarChartDescription()
	                            .name("publications per shelve")
	                            .keysExpression(this.m.asAQL("self.eAllContents(biblio::Shelve)"))
	                            .valuesExpression(this.m.asAQL("self.publications->size()"))
	                            .labelExpression(this.m.asAQL("self.name"))
	                            .style(this.m.newBarChartDescriptionStyle()
	                                    .barsColor("blue")
	                                    .build())
	                            .build())
	                    .build())
	            .build();
```

It generates a `XXXBuilders` class where `XXX` is your Ecore package name, and from there you can create new instances using builders (`YYYBuilder` where `YYY` is the EClass name)

It uses JMerge so you are able to customize changing the `@generated` annotations.

## Goals I pursued when trying this

I wanted to be able to:
- to be able to leverage my IDE to search for reference and easily get for instance, "all the colors I used" or "all the AQL expressions I used"
- to have the guarantee that my model is valid once it is built.
- to be able to factorize code which manipulate the model.
- to be able to add convenience methods to guarantee an uniform way to handle my datatype literals.
- to discover easily what sub elements/other types, I should be able to set in an area (not there yet.)
- to be able to add methods to take shortcuts leveraging the view model hierarchy -> doing so in the abstract builder classes.

And all of that while being able to easily deploy that on any project, whatever the IDE is used and with a minimal impact on the software build chain.


## What status is this ?

It's only a few hours of work used to prototype and see what could be achieved on Sirius's web **view** model, so I would expect that it would not work well with other Ecores currently.
Also: generated Java formatting is currently not great.

So expect rough edges and most likely the need to adapt the code.
 

## What would be cool ?

A number of things: 
- use Ecore documentation annotation for Javadoc.
- make sure it works with JBang for easy launch
- better Java formatting per default.
- ...


## How to launch ?

Either through the `main()` method or through maven which will handle the retrieval of the EMF dependencies (Have a look on the `pom.xml`)

```xml
	<plugin>
		  <groupId>org.codehaus.mojo</groupId>
		  <artifactId>exec-maven-plugin</artifactId>
		  <version>3.1.0</version>
		  <executions>
		    <execution>
		      <id>generate builders classes</id>
		      <phase>package</phase>
		      <goals>
		        <goal>java</goal>
		      </goals>
		    </execution>
		  </executions>
		        <configuration>
                    <executable>java</executable>
                    <mainClass>fr.obeo.dsl.playground.emfcodegen.builder.BuilderGenerator</mainClass>
                    <cleanupDaemonThreads>false</cleanupDaemonThreads>
                    <arguments>
                      <!-- the emf configuration file to use for JMerge -->
                       <argument>file:${project.basedir}/src/main/java/fr/obeo/dsl/playground/emfcodegen/builder/emf-merge.xml</argument>
                       <!-- the genmodel file -->
                       <argument>file:${project.basedir}../path/to/the/file.genmodel</argument>
                       <!-- the output folder file -->
                       <argument>file:${project.basedir}../path/to/the/folder/to/generate/java/code</argument>
                       <!-- package name to use for the generated code -->
                       <argument>fr.obeo.dsl.biblio.app.representationsbuilders.builders.test</argument>
                    </arguments>
                </configuration>
	</plugin>
```

