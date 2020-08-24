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
