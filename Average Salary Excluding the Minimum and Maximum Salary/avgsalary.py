class Solution:
    def average(self, salary: List[int]) -> float:
        minSalary = float(inf)
        maxSalary = float(-inf)
        sum = 0
        
        for salaries in salary:
            sum += salaries
            
            minSalary = min(minSalary,salaries)
            
            maxSalary = max(maxSalary,salaries)
            
        return (sum - minSalary-maxSalary) / (len(salary) -2)
        
