Stack<Integer> stack = new Stack<>();
        Deque<Integer> queue = new ArrayDeque<>();

        while (head != null) {
            stack.push(head.val);           
            queue.addFirst(head.val);
            head = head.next;
        }
       
        return Arrays.equals(stack.toArray(), queue.toArray());