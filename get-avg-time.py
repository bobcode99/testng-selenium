import subprocess
import os

testHowManyTimes = 5
eachTimesArr = []
totalSumTimes = 0

for i in range(testHowManyTimes):
    subprocess.run(["mvn", "test"])

    cmdOnlyTime = "grep -h testcase target/surefire-reports/TEST-*.xml | awk -F '\"' '{print $6 }' | sort -rn -k 3"
    resultTimes = os.popen(cmdOnlyTime).read()
    # print("resultTimes: ", resultTimes)

    afterSplitArr = resultTimes.splitlines()
    eachTimesArr.append(afterSplitArr)
    # print("afterSplitArr: ", afterSplitArr)

    for j in range(len(afterSplitArr)):
        totalSumTimes = totalSumTimes + float(afterSplitArr[j])


print("Total times: ", totalSumTimes)
print("EachTimesArr: ", eachTimesArr)