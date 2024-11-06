if __name__ == '__main__':
    list1 = [5,3,6,7,1]
    list2 = [2,4,6,3,9]
    print(list1)
    print(list2)
    
    list3 = list(map(lambda x, y: x + y,list1,list2))
    print(list3)