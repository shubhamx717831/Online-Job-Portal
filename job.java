<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Job Portal</title>
</head>
<body>
    <header>
        <h1>Welcome to the Online Job Portal</h1>
    </header>
    <main>
        <section>
            <h2>Search for Jobs</h2>
            <form>
                <label for="job-title">Job Title:</label>
                <input type="text" id="job-title" name="job-title" placeholder="Enter job title" required>
                <br><br>
                <label for="location">Location:</label>
                <input type="text" id="location" name="location" placeholder="Enter location" required>
                <br><br>
                <button type="submit">Search</button>
            </form>
        </section>
        <section>
            <h2>Job Listings</h2>
            <div class="job-listing">
                <h3>Software Engineer</h3>
                <p>Company: Tech Corp</p>
                <p>Location: New York, NY</p>
                <button>Apply Now</button>
            </div>
            <div class="job-listing">
                <h3>Data Analyst</h3>
                <p>Company: Data Insights</p>
                <p>Location: San Francisco, CA</p>
                <button>Apply Now</button>
            </div>
        </section>
        <section>
            <h2>Post a Job</h2>
            <form>
                <label for="company-name">Company Name:</label>
                <input type="text" id="company-name" name="company-name" placeholder="Enter company name" required>
                <br><br>
                <label for="job-title-post">Job Title:</label>
                <input type="text" id="job-title-post" name="job-title-post" placeholder="Enter job title" required>
                <br><br>
                <label for="job-location">Location:</label>
                <input type="text" id="job-location" name="job-location" placeholder="Enter location" required>
                <br><br>
                <button type="submit">Post Job</button>
            </form>
        </section>
    </main>
    <footer>
        <p>&copy; 2024 Online Job Portal. All Rights Reserved.</p>
    </footer>
</body>
</html>
