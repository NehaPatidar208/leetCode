class Solution:
    def reverseBits(self, n: int) -> int:
        l=bin(n)[2:]
        l=(('0'*(32-len(l)))+l)[::-1]
        return int(l,2)
