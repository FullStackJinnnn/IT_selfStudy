import random as r
import time as t
import matplotlib.pyplot as plt

def lottoGame():
    art = [
        "   .'`'.'`'.       88              ,d      ,d",
        ".''.`.  :  .`.''.  88              88      88",
        "'.    '. .'    .'  88  ,adPPYba, MM88MMM MM88MMM ,adPPYba,",
        ".```  .' '.  ```.  88 a8\"     \"8a  88      88   a8\"     \"8a",
        "'..',`  :  `,'..'  88 8b       d8  88      88   8b       d8 ",
        "   `-'`'-`))       88 \"8a,   ,a8\"  88,     88,  \"8a,   ,a8\"",
        "          ((       88  `\"YbbdP\"'   \"Y888   \"Y888 `\"YbbdP\"'",
        "           ))",          
        "           ||",
        "",
        "========================게임 이용 방법======================",
        "1. 로또번호는 1~15 사이의 랜덤한 3개의 숫자 입니다. (중복 X)",
        "2. 초기자산은 5000원이며 1개 구매 가격은 1000원 입니다.", 
        "3. 처음은 1회차 이며 당첨을 확인하면 다음회차로 넘어갑니다.",
        "4. 다음회차로 넘어가면 구매 가격은 1000원 증가합니다.",
        "============================================================",
        ""
    ]

    for line in art:
        print(line)

    ## 사용할 변수 초기화
        
    ## 구매한 로또 리스트를 담을 변수 추후 3차원으로 사용
    ## 1차원 : 회차 리스트를 담음
    ## 2차원 : 각 회차에 구매한 로또번호그룹 리스트를 담음
    ## 3차원 : 각 로또 번호를 담음 
    lottoBuyList = []

    ## 구매한 시간 저장
    lottoBuyTime = []

    ## 구매한 로또의 당첨 기록 저장
    lottoWinHistory = []

    ## 로또 당첨 번호 저장
    lottoNumber = []
    lottoNumber.append(r.sample(range(1, 15), 3))

    ## 초기 자산
    defaultMoney = 5000

    ## 초기 로또 가격
    lottoPrice = 1000

    ## 구매한 로또의 맞은 숫자 개수 저장
    matchCnt = []

    ## 구매할 로또 개수
    lottoBuyCnt = 0
    
    ## 이번 회차에 구매한 총 로또 개수 
    thisRoundTotalLottoBuyCnt = 0

    ## 그래프를 위한 회차에 따른 자산 변화 저장
    moneyChangedY = [5000]
    moneyChangedX = [0]

    ## 당첨을 확인한걸 판단해서 다음 회차로 넘어가기 위한 Flag
    winChkFlag = False

    ## 초기 회차
    lottoRound = 1
	
    ## 초기 회차 정보를 저장할 리스트 추가
    lottoWinHistory.append([])
    lottoBuyTime.append([])
    lottoBuyList.append([])
     
    while True:
        print("\n┌───────── LoTTo Game ─────────┐")
        print("│                                                │")
        print("│       경    고:  도박은 좋지 않습니다...       │")
        print("│                                                │")
        print("│       0. 종료                                  │")
        print("│       1. 구매하기                              │")
        print("│       2. 당첨 확인 및 자산 그래프 확인         │")
        print("│       3. 구매기록 확인                         │")
        print("└────────────────────────┘\n")
        while True:
            try:
                select = int(input("번호를  입력하세요 >> "))
                if select < 0 or 3 < select:
                    print("0~3 사이의 숫자만 입력해주세요\n")
                else:
                    break
            except:
                print("0~3 사이의 숫자만 입력해주세요\n")
            
        if select == 0:
            print("\n게임을 종료합니다... ")
            break
        
        elif select == 1:
            
            ## 당첨을 확인 했다면 회차 증가 
            if winChkFlag:
                lottoRound += 1
                lottoPrice += 1000
                lottoBuyCnt = 0
                thisRoundTotalLottoBuyCnt = 0
                lottoNumber.append(r.sample(range(1, 16), 3))
                matchCnt = []
                lottoWinHistory.append([])
                lottoBuyTime.append([])
                lottoBuyList.append([])
                
            print("\n◆ " + str(lottoRound) + "회차 로또 ◆")
            print("현재자산 : " + str(defaultMoney) + " 원")
            print("1개 가격 : " + str(lottoPrice) + " 원\n")

            while True:
                try:
                    lottoBuyCnt = int(input("몇개를 구매하시겠습니까? >> "))
                    if lottoBuyCnt < 1 :
                        print("1이상의 숫자만 입력해주세요\n")
                    else :
                        break
                except:
                    print("1이상의 숫자만 입력해주세요\n")
            if defaultMoney - lottoPrice * lottoBuyCnt < 0:
                print("돈이 부족합니다\n")
                
                ## 돈이 부족해서 구매에 재진입했을때 회차를 증가시키지 않기 위한 Flag 변경
                winChkFlag = False
                continue
            
            ## 각 회차의 정보 리스트를 담기위해 리스트 추가
            for i in range(lottoBuyCnt):
                lottoBuyList[lottoRound-1].append([])
                matchCnt.append(0)

            defaultMoney -= lottoPrice * lottoBuyCnt

            ## 구매할 로또 개수만큼 로또 번호 입력 (로또 1개당 3개의 숫자)
            for a in range(lottoBuyCnt):
                print("\n" + str(a+1) + "번째 로또 번호를 입력해주세요 (1개씩)")
                for i in range(3):
                    while True:
                        try:
                            inputNum = int(input()) 
                            if inputNum in lottoBuyList[lottoRound-1][a+thisRoundTotalLottoBuyCnt]:
                                print("중복된 번호! 다시 입력하세요\n")
                            elif inputNum < 1 or 15 < inputNum:
                                print("1~15 사이의 숫자만 가능합니다. 1개씩 다시 입력해주세요\n")
                            else:
                                lottoBuyList[lottoRound-1][a+thisRoundTotalLottoBuyCnt].append(inputNum)
                                break
                        except:
                            print("1~15 사이의 숫자만 가능합니다. 1개씩 다시 입력해주세요\n")
                lottoBuyTime[lottoRound-1].append(t.strftime('%Y-%m-%d %H:%M:%S'))

            thisRoundTotalLottoBuyCnt += lottoBuyCnt

            ## 새로운 회차에 진입했음으로 당첨확인 Flag 변경 
            winChkFlag = False

        elif select == 2:
            if len(lottoBuyList[0]) == 0:
                print("※ 구매한 로또가 없습니다...")
                continue
            else:
                
                ## 돈이 부족해서 구매하지 못하고 당첨을 확인했을때 이전에 구매한 그래프만 출력해주기 위한 체크
                if thisRoundTotalLottoBuyCnt != 0:
                    print("\n♣ " + str(lottoRound) +"회차 로또 번호 ♣")
                    print(lottoNumber[lottoRound - 1])
                    
                    print("\n♧ 구매한 로또 번호 ♧")
                    for i in range(thisRoundTotalLottoBuyCnt):
                        print(lottoBuyList[lottoRound - 1][i])

                    if not winChkFlag:
                        
                        ## 구매한 로또 개수만큼 반복
                        for a in range(thisRoundTotalLottoBuyCnt):
                            
                            ## 로또 숫자 개수만큼 각각의 자리 비교
                            for i in range(len(lottoNumber[lottoRound - 1])):
                                for j in range(len(lottoNumber[lottoRound-1])):
                                    if lottoBuyList[lottoRound - 1][a][i] == lottoNumber[lottoRound - 1][j]:
                                        matchCnt[a] += 1
                                        break

                    print("\n★★ 당첨 결과 ★★")             
                    for i in range(thisRoundTotalLottoBuyCnt):
                        if matchCnt[i] == 1:
                            print("축하축하 3등당첨...!")
                            if not winChkFlag:
                                defaultMoney += 10000
                                lottoWinHistory[lottoRound - 1].append("3등")
                        elif matchCnt[i] == 2:
                            print("축하합니다!!!!!!!!!! 2등당첨")
                            if not winChkFlag:
                                defaultMoney += 500000
                                lottoWinHistory[lottoRound - 1].append("2등")
                        elif matchCnt[i] == 3:
                            print("★☆★☆대박☆★☆★ 1등당첨")
                            if not winChkFlag:
                                defaultMoney += 10000000
                                lottoWinHistory[lottoRound - 1].append("1등")
                        else:
                            print("꽝")
                            lottoWinHistory[lottoRound - 1].append("꽝")


                    ## 당첨 확인 할때마다 그래프에 append되지 않기위해 체크         
                    if not winChkFlag:
                        moneyChangedX.append(lottoRound)
                        moneyChangedY.append(defaultMoney)
                        
                    ## 당첨을 확인해으니 Flag 변경 
                    winChkFlag = True     

                print("\n현재까지의 자산 변화 그래프")
                plt.plot(moneyChangedX, moneyChangedY, 'o--')
                plt.xticks(moneyChangedX)
                plt.title('Money changed status')
                plt.xlabel('Lotto Rounds')
                plt.ylabel('Money')
                plt.show()

        elif select == 3:
            if len(lottoBuyList[0]) == 0:
                print("※ 구매한 로또가 없습니다...")
                continue
            
            ## 로또를 구매한 회차만큼 반복 
            for a in range(lottoRound):
                print("\n--------------------" + str(a + 1) + "회차------------------")
                if len(lottoWinHistory[a]) == 0:
                    print("당첨 번호 ▶ 미확인")
                else:
                    print("당첨 번호 ▶ " + str(lottoNumber[a]))
                print("      구매시간        구매번호    당첨확인")
                if len(lottoBuyList[a])==0 :
                    print("※ 구매한 로또가 없습니다...")
                          
                ## 각회차에 구매한 로또 개수만큼 반복
                for i in range(len(lottoBuyList[a])):
                    if len(lottoWinHistory[a]) == 0:
                        print(str(lottoBuyTime[a][i]) + "   " + str(lottoBuyList[a][i]) + "    " + "미확인")                        
                    else:
                        print(str(lottoBuyTime[a][i]) + "   " + str(lottoBuyList[a][i]) + "      " + str(lottoWinHistory[a][i]))
            print("")
