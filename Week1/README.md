本周作业1用 add first 或 add last 这套新的 API 改写 Deque 的代码：
		Deque<String> deque = new LinkedList<>();

        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);

        String str = deque.peekFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size()>0){
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);

		
本周作业2分析 Queue 和 Priority Queue 的源码：
Queue
Queue是一个接口，继承自Collection，待实现的方法有：
boolean add(E e);
boolean offer(E e);
E remove();
E poll();
E element();
E peek();
其中add()、remove()、element()在异常时会抛出异常，而offer()、poll()、peek()会返回一个特殊值。
实现类有如下：
ArrayBlockingQueue
ConcurrentLinkedQueue
PriorityBlockingQueue
DelayQueue<E,extends,Delayed>
LinkedBlockingQueue
SynchronousQueue

PriorityQueue
PriorityQueue是一个类，继承自AbstractQueue，本质上也是继承了Queue，常用的方法如下：
add(E e)
put(E e)
clear()
offer(E e)
peek()
poll()
remove(Object o)
toArray()
有如下特点：不允许null元素，Comparable 实现自定义排序，toArray 可以返回当前的数组


学习笔记
​          	本周是算法训练营的第一周，主要学习了一些常用的数据结构如数组，链表，栈和队列的相关知识和实践。之前有上过算法训练营的体验课，第一周的内容不少在体验课都上过。
​        印象比较深刻的题目就是盛水最多的容器，第一次做的时候自己先思考了十来分钟，后来看了答案使用双指针法才知道这么巧妙，类似的还有作业最后一道题接雨水，这道题第一反应是按照覃超老师说的附近相似性采用栈来解决，最后AC时间复杂度和空间复杂度都是o(n)，看了答案才发现采用双指针法空间复杂度可以降为o(1)。还有一道比较深刻的题目是旋转数组，看题解才知道多次反转可以实现旋转数组。
​        个人感觉算法最重要的还是实践，覃超老师布置的题目都想做下，可惜上班工作时间有限，最后也尽可能完成了作业，给自己打下鸡血，希望后期尽可能作业都完成。