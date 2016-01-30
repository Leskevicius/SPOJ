# Rokas Leskevicius
# Thirteenth problem to be solved on SPOJ
# From http://www.spoj.com/problems/ARITH2/

n = int(raw_input())
for cases in range(n):
    raw_input() #ignore extra new line
    expression = raw_input().split()
    result = int(expression[0])
    for i in range(1, len(expression) -1, 2 ):
        if expression[i] == '+':
            result = result + int(expression[i+1])
        elif expression[i] == '-':
            result = result - int(expression[i+1])
        elif expression[i] == '*':
            result = result * int(expression[i+1])
        else:
            result = result / int(expression[i+1])
    print result
