# Template Method

定义一个操作中的算法的骨架（稳定），而将一些步骤延迟（变化）到子类中。Template Method使得子类可以不改变（复用）一个算法的结构即可重定义
（override重写）改算法的某些特定步骤。

# 应用场景

- 一次性完成算法的不变部分，然后将可以变化的部分留给子类来实现
- 子类之间的共同行为应分解并集中在一个共同类中以避免代码重复的情况
- 控制子类的扩展
