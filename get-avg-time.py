import subprocess
import os
import logging
import sys
from numpy import mean

# variables
testHowManyTimes = 2
eachTimesArr = []
totalSumTimes = 0
filename = "logs/test2.log"
arr_each_avg_time = []

# logging use
logger = logging.getLogger()
logger.setLevel(logging.INFO)
formatter = logging.Formatter('%(asctime)s | %(levelname)s | %(message)s')

stdout_handler = logging.StreamHandler(sys.stdout)
stdout_handler.setLevel(logging.DEBUG)
stdout_handler.setFormatter(formatter)

file_handler = logging.FileHandler(filename)
file_handler.setLevel(logging.DEBUG)
file_handler.setFormatter(formatter)

logger.addHandler(file_handler)
logger.addHandler(stdout_handler)

for i in range(testHowManyTimes):
    subprocess.run(["mvn", "test"])

    cmdOnlyTime = "grep -h testcase target/surefire-reports/TEST-*.xml | awk -F '\"' '{print $6 }' | sort -rn -k 3"
    resultTimes = os.popen(cmdOnlyTime).read()
    # logger.info(f"resultTimes: {resultTimes}")
    afterSplitArr = resultTimes.splitlines()
    float_list = [float(index_list) for index_list in afterSplitArr]
    eachTimesArr.append(float_list)
    # logger.info(f"afterSplitArr: {afterSplitArr}")
    for j in range(len(afterSplitArr)):
        totalSumTimes = totalSumTimes + float(afterSplitArr[j])

logger.info("Total times: %f", totalSumTimes)
logger.info(f"EachTimesArr: {eachTimesArr}")


for i in range(len(eachTimesArr)):
    each_avg_time = 0
    # float_list = [float(index_list) for index_list in eachTimesArr[i]]
    each_avg_time = mean(eachTimesArr[i])
    arr_each_avg_time.append(each_avg_time)

logger.info(f"arr_each_avg_time: {arr_each_avg_time}")

logger.info("Total mean: %f", round(mean(arr_each_avg_time), 4))