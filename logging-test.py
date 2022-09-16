# https://stackoverflow.com/a/64970162
import logging
import sys

logger = logging.getLogger()
logger.setLevel(logging.INFO)
formatter = logging.Formatter('%(asctime)s | %(levelname)s | %(message)s')

stdout_handler = logging.StreamHandler(sys.stdout)
stdout_handler.setLevel(logging.DEBUG)
stdout_handler.setFormatter(formatter)

file_handler = logging.FileHandler('logs/logs1.log')
file_handler.setLevel(logging.DEBUG)
file_handler.setFormatter(formatter)


logger.addHandler(file_handler)
logger.addHandler(stdout_handler)

value1 = 324
arr1 = [1, 2, 3, 5]
float_num1 = 3.1455
logger.info(f"hihi: {value1}")
logger.info("hihi1: %d", float_num1)
logger.info(f"arr: {arr1}")


logger.info('This is a log message!')
logger.info('This is a log message!')
logger.info('This is a log message!')
