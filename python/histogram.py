import matplotlib.pyplot as plt
##import random

##dice=[]
##for i in range(100000) :
##    dice.append(random.randint(1,6))

####print(dice)
##plt.hist(dice)
##plt.show()

import csv

li=[]
with open('test.csv.','r') as file :
    data=csv.reader(file)
    header=next(data)
    print(header)
    for row in data:
        if row[-1] == '' :
            break
        li.append(float(row[2]))

plt.hist(li)
plt.show()