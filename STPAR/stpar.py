
# Rokas Leskevicius
# Twelth problem to be solved on SPOJ
# From http://www.spoj.com/problems/STPAR/



def weird_sort(mylist = []):
    side_street = []
    required_value = 1
    for x in mylist:
        #case 1 where the required_val is in the side_street
        while len(side_street) != 0 and side_street[-1] == required_value:
            side_street.pop()
            required_value = required_value + 1
        #case 2 where the required value is the current element in the list
        if x == required_value:
            required_value = required_value + 1
        #if cases 1 and 2 fail and side_streets top element is smaller
        #than the current value, means we cannot sort it
        elif len(side_street) != 0 and side_street[-1] < x:
            return "no"
        #otherwise, add the value to the side street (stack)
        else:
            side_street.append(x)
    return "yes"

while True:
    n = int(raw_input())
    if n == 0:
        break
    mylist = raw_input().split(' ')
    mylist = [ int(x) for x in mylist ]
    print weird_sort(mylist)
