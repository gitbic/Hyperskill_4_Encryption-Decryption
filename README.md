# Hyperskill_4_Encryption-Decryption
Encode/decode data, use command prompt.

**Description**

This program uses different algorithms to encode/decode data. The first one would be shifting algorithm (it shifts each letter by the specified number according to its order in the alphabet in circle). The second one would be based on Unicode table.

**Input parameters:**

-alg (shift/unicode); default shift;

-mode (enc/dec); default enc;

-key (some number); default 0;

-data (some data);

-in (input file);

-out (output file);

If there are both -data and -in arguments, your program should prefer -data over -in.

If there is no -data, and there is no -in the program should assume that the data is an empty string.

If there is no -out argument, the program must print data to the standard output.

**Example:**

*java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode*

This command must get data from the file road_to_treasure.txt, encrypt the data with the key 5, create a file called protected.txt and write ciphertext to it.

*java Main -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode*

\jqhtrj%yt%m~ujwxpnqq&
