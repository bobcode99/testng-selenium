import subprocess
import os
import logging
import sys
from numpy import mean

# variables
testHowManyTimes = 10
eachTimesArr = []
totalSumTimes = 0
filename = "logs/pchomeTest-thread8-check10times-1.log"
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
    logger.info(f"Running test {i+ 1} now.")
    each_avg_time = 0
    subprocess.run(["mvn", "test"])

    cmdOnlyTime = "grep -h testcase target/surefire-reports/TEST-*.xml | awk -F '\"' '{print $6 }' | sort -rn -k 3"
    resultTimes = os.popen(cmdOnlyTime).read()
    afterSplitArr = resultTimes.splitlines()
    float_list = [float(index_list) for index_list in afterSplitArr]
    logger.info(f"Time now: {float_list}") #[3.5, 3.437, 3.33, 3.266]
    eachTimesArr.append(float_list)
    each_avg_time = mean(eachTimesArr[i])
    logger.info(f"Average time now: {each_avg_time}") # 3.38325
    arr_each_avg_time.append(each_avg_time)
    # logger.info(f"afterSplitArr: {afterSplitArr}")
    for j in range(len(afterSplitArr)):
        totalSumTimes = totalSumTimes + float(afterSplitArr[j])

logger.info(f"Time required for each cost: {arr_each_avg_time}")
logger.info("It took %f seconds in total", totalSumTimes)
logger.info(f"Average time required for each cost: {eachTimesArr}")
logger.info("Total average seconds: %f", round(mean(arr_each_avg_time), 4))