# Lab Part 1 - Server
## Screenshots
<img src = "https://user-images.githubusercontent.com/122554370/215673114-affe51c2-782a-4366-9f7e-47fe5b001dd1.png" alt="handler" width="400px"/>

![Screenshot 2023-01-30 at 9 21 49 PM](https://user-images.githubusercontent.com/122554370/215672655-2bf14fb6-0c5f-44ed-a609-c76581d2f33d.png)
### Relevant methods, their arguments, and values
* `getPath()` - no arguments. Acquires the URL path to parse.
* `equals()` - `String` argument ("/"). Checks for "/" as the delimeter
* `split()` - `String` argument ("="). splits the qurey string with "=" as a delimiter. 
* `format()` - String format, args ("%s%s\n", original_text, query_arg). Used to append the argument of the query ("Hello") to the existing string ("") while adding a newline at the end
    * original_text: ""
    * query_arg: "Hello"

![Screenshot 2023-01-30 at 9 22 03 PM](https://user-images.githubusercontent.com/122554370/215672658-9144b964-c395-46ad-b2de-66ddad5ec0eb.png)
### Relevant methods, their arguments, and values
* `getPath()` - no arguments. Acquires the URL path to parse.
* `equals()` - `String` argument ("/"). Checks for "/" as the delimeter
* `split()` - `String` argument ("="). splits the qurey string with "=" as a delimiter. 
* `format()` - String format, args ("%s%s\n", original_text, query_arg). Used to append the argument of the query "how are youto the existing string ("Hello") while adding a newline at the end
    * original_text: "Hello"
    * query_arg: "how are you"


### Relevant value(s): text
The `String` text has the argument of the query appended to it.

# Lab Part 2 - Bugs
## Reverse in place: 
### Failure inducing input:
Input: array containing {1, 2, 3, 4, 5}.\
Expected output: {5, 4, 3, 2, 1}\
```java
@Test
  public void testReverseInPlace_size5() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, input1);
  }
```
### Input that doesn't induce a failure
Input: array containing {1, 2, 3, 2, 1}.\
Expected output: {1, 2, 3, 2, 1}\
```java
@Test
  public void testReverseInPlace_size5wrong() {
    int[] input1 = { 1, 2, 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 1, 2, 3, 2, 1 }, input1);
  }
```

### Symptom
![Test](https://user-images.githubusercontent.com/122554370/215671793-8aa8a989-faac-4883-a4f3-03fe0f9910b7.png)
You can observe that there is only an error from the input `{1, 2, 3, 4, 5}`, but not from `{1, 2, 3, 2, 1}`.\
You can see that the error that occurs is that at index 3, an unexpected value occured, aka at least that value is wrong.\
Using this info, you can walk through the code to discover how this value was stored. 


### Bug
##### Before
![Screenshot 2023-01-30 at 9 04 12 PM](https://user-images.githubusercontent.com/122554370/215670767-dd063f0d-51a3-4aa1-a769-eed57d50a699.png)
Walking through the shows that input1[1] was copied from input1[3]. Because of it, input1[1]'s original value cannot be copied.\
##### After
![Screenshot 2023-01-30 at 9 04 44 PM](https://user-images.githubusercontent.com/122554370/215670771-dd1148a0-3f25-4c03-9d8b-126afdf6a3be.png)
As a result, we realize that we need to save a temporary copy of input1[1] to effectively swap values with input[3]. 

# Lab Part 3 - What I've Learning
I have come to have a high level understanding of how a website works. So far this is my understanding:

Using our own computers and linux servers, we can host websites. In those websites, the URL essentially acts like a file path, while extra parameters can be used for extra functionality such as queries.
