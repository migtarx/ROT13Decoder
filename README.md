# ROT13Decoder
ROT13 is a simple letter substitution cipher that replaces a letter with the 13th letter after it in the alphabet. ROT13 is a special case of the Caesar cipher which was developed in ancient Rome.
## Table of contents
* [General info](#general-info)
* [How it works](#how-it-works)

## General info
Applying ROT13 to a piece of text merely requires examining its alphabetic characters and replacing each one by the letter 13 places further along in the alphabet, wrapping back to the beginning if necessary. A becomes N, B becomes O, and so on up to M, which becomes Z, then the sequence continues at the beginning of the alphabet: N becomes A, O becomes B, and so on to Z, which becomes M.

![ROT13WHITE](https://user-images.githubusercontent.com/63917673/98718239-78908f00-238e-11eb-8873-443c9853b01c.png)
## How it works
**Message Encryption**

![encryp1](https://user-images.githubusercontent.com/63917673/98723659-f8b8f380-2392-11eb-978f-03bfd7080622.png)

⮞ In function "encrypt" the input is the message we want to encrypt. It can be sent from a Main Class or from a form as well. **Orange box** represents input data. It can only be String type (We want to convert messages no numbers)

⮞ The **red box** surrounds the variable "codedMessage", this variable will receive all chars converted from normal alphabet to ROT13 alphabet and all of them will be concatenated with each other respectively.

⮞ For Loop surrounded by **green** goes through the message we want to encrypt from start to finish. With "i" variable declared in for loop will be used to check each char in the position determined by it in the input message. 

⮞ For Loop surrounded by **blue color** goes through the alphabet string from start to finish. **"j"** varible declared in for loop will be used to check each char in the position determined by it in the **"alphabet"** string.

⮞ Finally, going through **if stament** (which is surrounded by a **yellow box**), checks the content in the position of the input String **"message"** with **"chartAt" method** and inside of it, with **"i"** variable will determine the position to check. With this, **if stament** will **compare** the character **extracted** from the input string **"message"** and later it will be checked with the one **extracted** from the String "**alphabet"**. **If both characters match**, it will enter the conditional structure "if" and with "j" variable previusly declared in the second for loop it will extract the character from string "rot13Alphabet" (Which is already ordered to match with the normal alphabet applying the standard established by ROT13) in the given position determinated by **"j"** value.

⮞ Return stament** takes care of returning the message encrypted (It's surrounded with **purple color**)

**Message Decryption**

![decryp1](https://user-images.githubusercontent.com/63917673/98724507-29e5f380-2394-11eb-908c-4bebbaac37ec.png)
