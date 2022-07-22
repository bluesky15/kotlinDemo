package leetCode

fun slidingWindowMax(nums: List<Int>, k: Int, n: Int): List<Int> {
   var dq = ArrayDeque<Int>()
    var result = mutableListOf<Int>()
    for(i in 0 until n ){
        if(dq.isNotEmpty() && dq.first()==i-k)dq.removeFirst()
        while (dq.isNotEmpty() && nums[dq.last()]<nums[i])dq.removeLast()
        dq.addLast(i)
        if(i>k-1){
            result.add(nums[dq.first()])
        }
    }
    return result
}