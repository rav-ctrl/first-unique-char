fun firstUniqChar(s: String): Int {
    val hashmap = LinkedHashMap<Char, Int>()
    val hashset = HashSet<Char>()
    for (i in s.indices) {
        val ch = s[i]

        if (hashset.contains(ch)) {
            continue
        }
        if (hashmap.containsKey(ch)) {
            hashmap.remove(ch)
            hashset.add(ch)
            continue
        }

        hashmap[ch] = i
    }

    for (h in hashmap) {
        return h.value
    }

    return -1
}
