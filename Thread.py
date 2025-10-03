import threading

def print_even():
    for num in range(30, 51):
        if num % 2 == 0:
            print(f"Even: {num}")

def print_odd():
    for num in range(30, 51):
        if num % 2 != 0:
            print(f"Odd: {num}")

# Create threads
thread_even = threading.Thread()
thread_odd = threading.Thread(target=print_odd)

# Start threads
thread_even.start()
thread_odd.start()

# Wait for both threads to complete
thread_even.join()
thread_odd.join()

print("Done printing even and odd numbers.")
