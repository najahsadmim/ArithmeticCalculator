def add(n1,n2): return n1+n2
def subt(n1,n2): return n1-n2;
def multi(n1,n2): return n1*n2
def divi(n1,n2): return n1/n2;

exp=input("Please enter an arithmetic expression: ").replace(" ","")

op=""
if "+" in exp: op="+"
elif "-" in exp: op="-"
elif "*" in exp: op="*"
elif "/" in exp: op="/"

if not op:
    print("INVALID EXPRESSION")
else:
    parts=exp.split(op);
    n1=int(parts[0])
    n2=int(parts[1])
    
    if op=="+": print("Result: ", add(n1, n2))
    elif op=="-": 
        if n1>=n2:
            print("Result: ", subt(n1, n2))
        else:
            print("ERROR")
    elif op=="*": print("Result: ", multi(n1, n2))
    elif op=="/": 
        if n2==0:
            print("RUNTIME ERROR")
        else:
            print("Result: ", divi(n1, n2))
