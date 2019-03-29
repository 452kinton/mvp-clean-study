# mvp-clean-study

## How to Use

Step 1. Add the JitPack repository to your build file

gradle:

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.452kinton:mvp-clean-study:Tag'
	}

To get a Git project into your build:


maven :Step 1. Add the JitPack repository to your build file

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
    
Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.452kinton</groupId>
	    <artifactId>mvp-clean-study</artifactId>
	    <version>Tag</version>
	</dependency>