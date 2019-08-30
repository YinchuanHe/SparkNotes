# Why rewrite Hashcode and Equals
## 1.How Hash and Hashmap in Java works
Assum we have a Hash function:
`(x * x) % 5` This is way to simple for real, so it just an example.
If we put `6` into a Hash table using our Hash function, the Hash value for `6` will be `1`. So the result looks like this:  
![alt text](/6inHash.png)