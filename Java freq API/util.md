# Util Packages  
## 1. ArrayList  
### Constructor
  `List<Obj> arrayList = new ArrayList<Obj>();` 
### Methods 
  * **get(idx)**: Return the value refer to the index (start from 0)  
  * **add(elem)**: Add the elem into the end of arrayList  
  * **set(idx, value)**: Set a new value refer to the index  
  * **remove(idx)**: Remove an element refer to the index (auto resize O(n))  
  * **clear()**: Clear the arrayList  
  * **size()**: return the size/length of the arrayList  
***
## 2. HashMap
### Constructor  
  `HashMap<K, V> hashMap = new HashMap<K, V>(int initialCapacity);`  
### Methods  

  * **put(K, V)**: Associates the specified value with the specified key in this map(putIfAbsent(K, V))  
  * **get(K)**: Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key  
  * **containsKey(Object key)**: Returns true if this map contains a mapping for the specified key  
  * **containsValue(Object value)**: Returns true if this map maps one or more keys to the specified value  
  * **remove(Object key)**: Removes the entry for the specified key only if it is currently mapped to the specified value   
  * **clear()**: Remove all mapping from the map 
  * **size()**: Returns the number of key-value mappings in this map  
  * **isEmpty()**: Returns true if this map contains no key-value mappings
***
## 3. HashSet
### Constructor  
  `HashSet<Obj> set = new HashSet<Obj>(int initialCapacity);`  
### Methods  
  * **add(E e)**: Adds the specified element to this set if it is not already present; return boolean
  * **contains(Obj)**: Returns true if this set contains the specified element.
  * **remove()**
  * **clear()**
  * **size()**
  * **isEmpty()**
***
## 4. Deque/Stack
### Constructor
  `Deque<Integer> stack = new ArrayDeque<Integer>();`
### Methods  
![dequeImg](deque.png)  

note: Prefer using offer/poll/peek set since they return boolean to indicates successfulness
***
## 5. String
### Constructor
  `String str = "abc";`
### Methods
  * **length()**: Return length
  * **toCharArray()**: Converts this string to a new character array.
  * **charAt(idx)**: Returns the char value at the specified index.
  * **compareTo(String anotherString)**: Compares two strings lexicographically (Case sensitive) return 0 if equal
  * **concat(String str)**: Concatenates the specified string to the end of this string; return the concatenated string
  * **contains(CharSequence)**: Returns true if and only if this string contains the specified sequence of char values  
  * **equals(String)**: Return boolean  
  * **split(String regex)**: Splits this string around matches of the given regular expression.
  * **substring(int beginIndex)**: Returns a string that is a substring of this string
***
## 6. StringBuilder
### Constructor
`StringBuilder str = new StringBuilder();`
### Methods
  * **append(arg)**: Appends the string representation of the argument to the sequence.
  * **insert(int offset, arg)**: Inserts the string representation of the argument into this sequence.
  * **delete(int start, int end)**: Removes the characters in a substring of this sequence
  * **deleteCharAt(int index)**: Removes the char at the specified position in this sequence
  * **replace(int start, int end, String str)**: Replaces the characters in a substring of this sequence with characters in the specified String
  * **setCharAt(int index, char ch)**: The character at the specified index is set to ch
  * **toString()**: Returns a string representing the data
***
## 7. PriorityQueue
### Constructor
`PriorityQueue<Class> pq = new PriorityQueue<Class>(int initialCapacity, Comparator<? super E> comparator);`
### Methods
 * **add(E e)**:Inserts the specified element into this priority queue; return boolean. Time complexity: **_O(log(n))_**
 * **contains(Obj)**: Returns true if this queue contains the specified element. Time complexity: **_O(n)_**
 * **offer(E e)**: Inserts the specified element into this priority queue; return boolean. Time complexity: **_O(log(n))_**
 * **peek()**: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. **_O(1)_**
 * **poll()**: Retrieves and removes the head of this queue, or returns null if this queue is empty.**_O(1)_**
 * **remove(Obj)**: Removes a single instance of the specified element from this queue, if it is present. **_Find the element O(n), remove it O(log(n))_**
 * **size()**: Returns the number of elements in this collection.
 * **clear()**: Removes all of the elements from this priority queue.
 * **toArray()**: Returns an array containing all of the elements in this queue.

  

