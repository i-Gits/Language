<p align="center"><b>NetBeans</b> </p>

> an (IDE) for Java. NetBeans allows applications to be developed from a set of modular software components called modules. NetBeans runs on Windows, macOS, Linux and Solaris.

NetBeans - Wikipedia


<sub><sub>[hover-effect/readme.md](https://github.com/robin-dela/hover-effect/blob/master/readme.md?plain=1)</sub></sub>
<!--- while looking for ways to create "a hover to define" effect, i stumbled upon this. It looked so cool so I put this in here just to remind me of the possibilities.---> 
<p align="center">
    <img alt="example 1" src="https://github.com/robin-dela/hover-effect/blob/master/gifs/1.gif?raw=true" width="256">
    <img alt="example 2" src="https://github.com/robin-dela/hover-effect/blob/master/gifs/2.gif?raw=true" width="256">
</p>

["Hello World!" for the NetBeans IDE](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/netbeans.html)

<details>
  <summary> GOALS </summary>

#  Creating Your First Application
<sub><sub>*copied and pasted from the above linked site</sub></sub>


Your first application, HelloWorldApp, will simply display the greeting "Hello World!" To create this program, you will:

> # 1. Create an IDE project

When you create an IDE project, you ** create an environment ** in which to build and run your applications. Using IDE projects eliminates configuration issues normally associated with developing on the command line. You can build or run your application by choosing a single menu item within the IDE.

IDE <<integrated development environment>>  = a world to build applications. ~ can also run apps there.
pros: less "configuration" issues {usually w command line}

  ### これは何?
  > configuration issues
  > single menu item? 


> # 2. Add code to the generated source file

A source file contains code, written in the Java programming language, that you and other programmers can understand. 
As part of creating an IDE project, a skeleton source file will be automatically generated. You will then modify the source file to add the "Hello World!" message.

  ### これは何?
  > skeleton source file


> # 3. Compile the source file into a .class file

The IDE invokes the Java programming language compiler (javac), 
which takes your source file and translates its text into instructions that the Java virtual machine can understand. 

The instructions contained within this file are known as bytecodes.

  ### これは何？
  > virtual machine
> .class file = compiled source file (so java vm can read it)




> # 4. Run the program

The IDE invokes the Java application launcher tool (java), which uses the Java virtual machine to run your application.




</details>

<details>
  <summary> My attempt - Progress </summary>

  ![image](https://github.com/i-Gits/Language/assets/157287055/d12de662-21e8-4476-bfb3-702901304ecf)


![image](https://github.com/i-Gits/Language/assets/157287055/fc0b3fe2-a6a7-4a4d-9ae3-968f21f805f6)

is there a dark mode for this?

![image](https://github.com/i-Gits/Language/assets/157287055/6a68b97f-a156-4f89-9a68-9edbb75e82c7)

![image](https://github.com/i-Gits/Language/assets/157287055/a2c2e480-b6d9-4594-9b30-a390fea96757)

![image](https://github.com/i-Gits/Language/assets/157287055/172f1fdc-b1e3-4185-9fdb-8366e5962b73)

![image](https://github.com/i-Gits/Language/assets/157287055/f743fd8b-652e-4662-b03c-fc82b903df14)

The Java Platform Manager

To set this JDK as the default for all projects, you can run the IDE with the --jdkhome switch on the command line, or by entering the path to the JDK in the netbeans_j2sdkhome property of your INSTALLATION_DIRECTORY/etc/netbeans.conf file.

>  ![image](https://github.com/i-Gits/Language/assets/157287055/c2878fe5-4c2c-44c6-911c-02a93076e87d)

![image](https://github.com/i-Gits/Language/assets/157287055/2edfe6a6-d257-4aeb-b261-329f63d82dba)

![image](https://github.com/i-Gits/Language/assets/157287055/618fe60e-af3d-4ae5-93e3-11a932877b25)
far better 

![image](https://github.com/i-Gits/Language/assets/157287055/028f2a9c-a3b7-4149-abda-041eb3834e82)

![image](https://github.com/i-Gits/Language/assets/157287055/551086c3-47b5-4e71-b01c-6f682b59bec0)

Failed to execute.

![image](https://github.com/i-Gits/Language/assets/157287055/3b107c7c-0eec-41f7-bc7f-41689ca4559e)

![image](https://github.com/i-Gits/Language/assets/157287055/79cfd5ff-f463-49ca-99d2-9d182c559059)

> tried copy and pasting the code instead, still doesn't work








</details>


<details><summary>My attempt - Progress</summary>

Used ANTS instead of MAVEN

![image](https://github.com/i-Gits/Language/assets/157287055/51fac545-114d-4a74-81f3-abb26f1203dd)


![image](https://github.com/i-Gits/Language/assets/157287055/b15c7d2c-e06d-4fac-b1ea-5d9d253e929a)

To compile is to run 

![image](https://github.com/i-Gits/Language/assets/157287055/4e473266-b2ed-4466-82ef-a472c87a4d7a)

![image](https://github.com/i-Gits/Language/assets/157287055/383babd8-69ea-49ed-ae56-bad069b8d7ab)

![image](https://github.com/i-Gits/Language/assets/157287055/0ca92441-6b2f-40bd-9876-1c34c714f28a)
#### When you build the project, the bytecode file HelloWorldApp.class is generated. 

![image](https://github.com/i-Gits/Language/assets/157287055/5d05d63d-fd4a-4fc9-9e44-9bf3e77979e9)

> where is the .class file?

</details>





<details>
    <summary> Netbeans issue : Posted </summary>

< Could not edit post; need more karma to 
1. Post images (20)
2. Include more than 8 links (10)
3

        This is my Code:


    package hello.learningjava;
 
    public class NewClassTEST {
    
        public static String aMadeUpString() {
        
            return ("Holy moly cow, 你好 よくできました！");
        }
    }


[Image of the code](https://github.com/i-Gits/Language/assets/157287055/552cc3fb-75f3-48e8-94fd-75b5ca64c9ea)

In main:

    NewClassTEST b = new NewClassTEST();
    String TEST = b.aMadeUpString();
    System.out.println(TEST);`

Output:
`Holy moly cow, ?? ????????`

[What the output window shows](https://github.com/i-Gits/Language/assets/157287055/b2fa5055-4b2e-4757-bcc6-bed93997aa56)

Expected Output:
Print
`Holy moly cow, 你好 よくできました！`
in the Output Window (Clearly displaying CJK)

< --- attempts --- >

Tried following along some of the [Stackoverflow answers in here - Netbeans 9 - Print Unicode Characters](https://stackoverflow.com/questions/53257763/netbeans-9-print-unicode-characters). 
Also tried looking into this user's question -
[Stackoverflow : NetBeans 15 Hindi Character Display Issue](https://stackoverflow.com/questions/73950077/netbeans-15-hindi-character-display-issue)

Note: I opened an issue for [myself in Github](https://github.com/i-Gits/Language/issues/2) and what is written here is what I wrote there as well.


Tried adding 

`-J-Dfile.encoding=UTF-8` & 
`-J-Dawt.useSystemAAFontSettings=On` 

at the end of 

> netbeans.conf 
located in ` C:\Program Files\NetBeans-20\netbeans\etc `

[image: C:\Program Files\NetBeans-20\netbeans\etc](https://github.com/i-Gits/Language/assets/157287055/5860a3cf-9e0e-417c-b7dd-7d2f0e018bd0)
 
[image: Opened .conf in Notepad++](https://github.com/i-Gits/Language/assets/157287055/89cdacd6-d1ea-4dc4-8f08-de4070c4228b)

[image: Added at the end of the code line](https://github.com/i-Gits/Language/assets/157287055/1ce5afba-d312-4f01-8007-2dfc4356a546)

[Source](https://stackoverflow.com/questions/55112673/newly-installed-fonts-do-not-appear-in-netbeans)


I couldn't follow along every point in the first Stackoverflow link but here's what I have been able to try:

Added code and results:
[image: Netbeans IDE](https://github.com/i-Gits/Language/assets/157287055/cb1a3f58-cf53-4747-8c89-6e0634ae1586)

(Netbeans' hints)
Imported the following:
[image: import](https://github.com/i-Gits/Language/assets/157287055/d6f509c1-2eab-4ee7-9d90-027949c0694a)


Result: 
[image: Result in Output Window](https://github.com/i-Gits/Language/assets/157287055/cef402cf-4c6d-4b0e-9f1a-62e8bc2b82ee)

No longer 
    `??????` 
but now it is:
    ` ä½ å¥½ ã‚ˆã��ã�§ã��ã�¾ã�—ã�Ÿï¼�`

<--- . --->

It's been hours and I can't seem to find a resolution.

I made sure to **restart** Netbeans with every edit to the settings, `tools>options>fonts...` or config. 
I tried finding other questions of similar nature not listed here but none of them have worked so far. They're also from previous versions of the IDE. I am using **Netbeans 20.**

I tried *installing* various fonts and *switching* fonts. (Although what I downloaded were `.otf`, not `.ttf`)
Tried *importing* new font .zip files (Noto JP, Noto Emoji)
 
Tried Monospace, Courier, Noto JP, Noto Emoji, Arial in **both** the `MISCELLANEOUS > OUTPUT > FONT` and `TOOLS>OPTIONS>FONTS & COLORS`.
Note: `Courier` displays CJK text in the editing window, but not in the Output window.

I have restarted my PC several times.

I am new to programming so some of the possible solutions like 
> 2. From the Projects panel set {project} > Properties > Sources > Encoding to UTF-8.

from user skomisa, I could not execute. I'm not sure how to go about doing this. I tried looking online on how to find properties in the projects panel set, could I also be guided on how to do this?

If you know any other way to solve this, please let me know. 
Thank you!


<!--- 2024 02 11 --->


</details>
