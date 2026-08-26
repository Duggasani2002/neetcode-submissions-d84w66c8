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


    }
}
