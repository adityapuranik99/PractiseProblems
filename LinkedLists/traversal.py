# Node class
class Node:

    ## Function to initialize Node object
    def __init__(self,data):
        self.data = data
        self.next = None


# Linked List class

class LinkedList:

    # Function to initialize 
    # List object
    def __init__(self):
        self.head = None
        self.tail = None

    def printList(self):
        temp = self.head
        while(temp):
            print(temp.data)
            temp = temp.next

    def append(self, new_node):
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        self.tail.next = new_node
        self.tail = self.tail.next


if __name__ == '__main__':
    
    ## Take inputs for test cases
    t = int(input())
    for cases in range(t):
        n = int(input())
        a = LinkedList()
        nodes = list(map(int, input().strip().split()))
        print(nodes)
        for x in nodes:
            node = Node(x)
            a.append(node)
        
        a.printList()