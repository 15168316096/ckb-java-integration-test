git clone https://github.com/gpBlockchain/ckb-rpc-mock-data.git
cd ckb-rpc-mock-data
pip install -r requirements.txt
python3 api/index.py > index.log 2>&1 &
cd ../
