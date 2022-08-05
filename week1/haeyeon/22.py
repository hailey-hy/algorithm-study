def solution(s):
    test_word = ""
    answer = ""
    for i in s:
        test_word += i
        if test_word == "zero" or test_word == "0":
            answer += "0"
            test_word = ""
        elif test_word == "one" or test_word == "1":
            answer += "1"
            test_word = ""
        elif test_word == "two" or test_word == "2":
            answer += "2"
            test_word = ""
        elif test_word == "three" or test_word == "3":
            answer += "3"
            test_word = ""
        elif test_word == "four" or test_word == "4":
            answer += "4"
            test_word = ""
        elif test_word == "five" or test_word == "5":
            answer += "5"
            test_word = ""
        elif test_word == "six" or test_word == "6":
            answer += "6"
            test_word = ""
        elif test_word == "seven" or test_word == "7":
            answer += "7"
            test_word = ""
        elif test_word == "eight" or test_word == "8":
            answer += "8"
            test_word = ""
        elif test_word == "nine" or test_word == "9":
            answer += "9"
            test_word = ""
        
    return int(answer)