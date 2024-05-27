import csv
import matplotlib.pyplot as plt


li_x_year=[]
li_y_revenue=[]
li_y_growthRate=[]
flag = False


with open('bisang8.csv','r', encoding='UTF8') as file :
    data=csv.reader(file)
    header = next(data)
    print(header)
    
    for row in data:
        if row[-1] == '':
            break
        li_x_year.append(row[0])
        li_y_revenue.append(int(row[1]))
        if not flag :
            flag = True
            continue
        li_y_growthRate.append(float(row[2]))


fig, ax1 = plt.subplots()
ax1.bar(li_x_year,li_y_revenue, alpha=0.3,  label='revenue')
ax2 = ax1.twinx()
ax2.plot(li_x_year[1:3], li_y_growthRate, 'o--', label='growthRate', color='red')
ax1.set_xlabel('Year')
ax2.set_ylabel('GrowthRate(%)')
ax1.set_ylabel('Revenue(million)')


lines, labels = ax1.get_legend_handles_labels()
lines2, labels2 = ax2.get_legend_handles_labels()
ax1.legend(lines + lines2, labels + labels2, loc='upper left')
plt.title('Revenue of the Information Security Industry [BAR] \n GrowthRate of the Information Security Industry [LINE]', pad=20)

plt.show()