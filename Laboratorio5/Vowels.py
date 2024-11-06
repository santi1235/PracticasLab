if __name__ == '__main__':
    text = input("Introduce una palabra: ")

    print(f"\nTu palabra {text} contiene las siguientes vocales:\n")

    vowels = list(filter(lambda x: x in 'aeiouAEIOU', text))
    
    print(vowels)