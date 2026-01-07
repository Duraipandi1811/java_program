// ===== GET ELEMENTS =====
const inputSection = document.getElementById("inputSection");
const welcomeSection = document.getElementById("welcomeSection");
const ageSection = document.getElementById("ageSection");
const calculatorSection = document.getElementById("calculatorSection");

const startBtn = document.getElementById("startBtn");
const userNameInput = document.getElementById("userName");
const dobInput = document.getElementById("dob");

const welcomeMsg = document.getElementById("welcomeMsg");
const countdownEl = document.getElementById("countdown");

// Age elements
const yearsEl = document.getElementById("years");
const daysEl = document.getElementById("days");
const hoursEl = document.getElementById("hours");
const minutesEl = document.getElementById("minutes");
const secondsEl = document.getElementById("seconds");

// Calculator
const display = document.getElementById("calcDisplay");
const buttons = document.querySelectorAll(".calculator button");

// ===== START BUTTON CLICK =====
startBtn.addEventListener("click", () => {
    const name = userNameInput.value;
    const dob = dobInput.value;

    if (name === "" || dob === "") {
        alert("Please enter all details");
        return;
    }

    inputSection.style.display = "none";
    welcomeSection.style.display = "block";
    welcomeMsg.innerHTML = `Welcome, ${name}!`;

    startCountdown(dob);
});

// ===== COUNTDOWN FUNCTION =====
function startCountdown(dob) {
    let count = 3;
    countdownEl.innerHTML = count;

    const interval = setInterval(() => {
        count--;
        countdownEl.innerHTML = count;

        if (count === 0) {
            clearInterval(interval);
            welcomeSection.style.display = "none";
            ageSection.style.display = "block";
            calculatorSection.style.display = "block";
            startAgeCounter(dob);
        }
    }, 1000);
}

// ===== LIVE AGE COUNTER =====
function startAgeCounter(dob) {
    setInterval(() => {
        const birthDate = new Date(dob);
        const now = new Date();

        let diff = now - birthDate;

        const years = Math.floor(diff / (1000 * 60 * 60 * 24 * 365));
        const days = Math.floor(diff / (1000 * 60 * 60 * 24));
        const hours = Math.floor(diff / (1000 * 60 * 60));
        const minutes = Math.floor(diff / (1000 * 60));
        const seconds = Math.floor(diff / 1000);

        yearsEl.innerHTML = years;
        daysEl.innerHTML = days;
        hoursEl.innerHTML = hours;
        minutesEl.innerHTML = minutes;
        secondsEl.innerHTML = seconds;
    }, 1000);
}

// ===== CALCULATOR LOGIC =====
buttons.forEach(button => {
    button.addEventListener("click", () => {
        const value = button.innerText;

        if (value === "C") {
            display.value = "";
        } 
        else if (value === "=") {
            try {
                display.value = eval(display.value);
            } catch {
                display.value = "Error";
            }
        } 
        else {
            display.value += value;
        }
    });
});
