class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false

        val a = IntArray(26)
        val b = IntArray(26)

        for(i in s1.indices) {
            a[s1[i]-'a']++
            b[s2[i]-'a']++
        }

        if(a.contentEquals(b)) return true

        for(i in s1.length until s2.length) {
            b[s2[i]-'a']++
            b[s2[i-s1.length]-'a']--
            
            if(a.contentEquals(b)) return true

        }

        return false
// We create two arrays of size 26: one stores character counts of s1, and the other stores counts of the current window in s2. For first 3 characters, s1 = "abc" gives counts a=1,b=1,c=1, and first window "lec" gives l=1,e=1,c=1, not equal.

// Then we slide the window by one: add new right character and remove old left character. Windows become "eca", then "cab"; "cab" has a=1,b=1,c=1, same as "abc", so return true.

    }
}
