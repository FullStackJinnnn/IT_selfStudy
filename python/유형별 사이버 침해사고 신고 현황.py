import csv
import matplotlib.pyplot as plt

li_x=[]
li_y_Ddos=[]
li_y_Malware=[]
li_y_Malransomware=[]
li_y_ServerHacking=[]
li_y_ETC=[]
li_y_RansomwarePercent=[]

with open('bisang2.csv','r', encoding='UTF8') as file :
    data=csv.reader(file)
    header = next(data)
    print(header)
    for i in range(len(header)):
        if i%2==1:
            li_x.append(header[i][0:13])
    print(li_x)
    for row in data:
        if row[-1] == '':
            break
        category = row[0]  
        print(category)
        if category == 'DdoS공격':
            for i in range(len(row)):
                if i%2==1:
                    li_y_Ddos.append(int(row[i]))
        elif category == '악성코드':
            for i in range(len(row)):
                if i%2==1:
                    li_y_Malware.append(int(row[i]))            
        elif category == '악성코드(랜섬웨어)':
            for i in range(len(row)):
                if i%2==1:
                    li_y_Malransomware.append(int(row[i]))             
        elif category == '서버 해킹':
            for i in range(len(row)):
                if i%2==1:
                    li_y_ServerHacking.append(int(row[i]))             
        else:
            for i in range(len(row)):
                if i%2==1:
                    li_y_ETC.append(int(row[i]))
    print(li_y_Malransomware)
    for i in range(len(li_y_Malransomware)):
        li_y_RansomwarePercent.append(li_y_Malransomware[i]/li_y_Malware[i]*100)
    print(li_y_RansomwarePercent)
fig, ax1 = plt.subplots()
ax1.plot(li_x, li_y_Ddos, 'o--', label='Ddos')
ax1.plot(li_x, li_y_Malware, 'o--', label='Malware')
ax1.plot(li_x, li_y_Malransomware, 'o--', label='Malware(Ransomware)')
ax1.plot(li_x, li_y_ServerHacking, 'o--', label='ServerHacking')
ax1.plot(li_x, li_y_ETC, 'o--', label='ETC')
ax2 = ax1.twinx()
ax2.bar(li_x,li_y_RansomwarePercent, alpha= 0.3, label='Ransomware %')
ax1.set_xlabel('Year')
ax1.set_ylabel('Number of reports')
ax2.set_ylabel('Malware(Ransomware) %')

lines, labels = ax1.get_legend_handles_labels()
lines2, labels2 = ax2.get_legend_handles_labels()
ax1.legend(lines + lines2, labels + labels2, loc='upper left')
plt.title('Yearly reported cases of cybercrime [LINE] \n the percentage of ransomware among Malware by year [BAR]', pad=20)

plt.show()