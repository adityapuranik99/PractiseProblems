public class hashingIntro {
    // Problem : Let's say you have k different integer IDs, 
    // and you know that all IDs in the range 0 to n-1 (n is also given is in order of 10^3)
    // You have to find number of unique IDs?

    // i/p : [1, 0, 4, 2, 1, 0, 3], n = 5
    // o/p : 5

    // you have an bucket array
    
    for ( int i = 0; i< k; i++)
    {
        bucket[ID[i]] = 1;
    }

    int ans = 0;
    for(int i = 0; i<n; i++)
        ans+=bucket[i];
   

    // X%Y = remainder when X is divided by Y
    // [0,Y-1]

    // data = key

    // hashf(key) = key%table_size;
    // [0, table_size-1]

    // 70,17, 12, 7, 15..
    // hashf(k) = k%7;

    // collision = two keys generating same value
    // There are couple of methods to handle this method

    // First is to chain it using linked list

    // Second is open addressing:

    // hashf(k) = k % table_size;
    // hashf(k) = k % 7;

    // Open addressing, put in a empty slot. 

    // For searching, we go to x%7, and if the element is not there, then we start traversing

    // In open addressing, we do not leave any space, i.e. no space is wasted.


    // Double Hashing 

    // h(k) = (h1(k)+ h2(k)*i)%table_size
    // i is the collision parameter
    // whenever we have a collision, increase or change parameter i. 

    // Quadratic probing is better than linear probing
    // K keys, you need 2*k table size min.

    // Look for: Universal hashing, bloom filters. 

}