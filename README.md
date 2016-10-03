# Java-Lab4
<p>Homework assignment: Politicial Donations</p> 

<p>This program is designed to track political donations made this election year. For this project, you can either hard code the names of at least 15 donors or you may get user input, your choice.
You will create the following parallel arrays &amp; variables (use these exact variable names):</p>
  <ul>
    <li>donorName: a String array to hold the first and last names of donors.</li>
    <li>amtDonated: an array of doubles to hold the amount of the donation.</li>
    <li>numDonations: an array of integers to hold the number of times the donation will be made.</li>
    <li>totalDonation: an array of doubles to hold the total donation made by each donor.</li>
    <li>grandTotalDonations: a double to hold the sum of all donations from all donors.</li>
   </ul>
<p>The program should match data in each array through subscripts (parallel arrays). For example, Dale Remick pledged to donate $25 four times: donorName[0] will be Dale Remick, amtDonated[0] will be 25.0, and numDonations[0] will be 4. Therefore, totalDonation[0] will be 100.0.</p>
<p>The program should display the donor number and each donor’s name (or get user input for donor name). Then get user input for the amount of the donation and number of times that amount will be donated. The program should then calculate the total donation from that donor (amtDonated[i] * numDonations[i]) which should be stored in the totalDonation array.</p>
<p>After all data has been entered and calculated, the program should display the donor number, the donor name, the amount of each donation, the number of times that donation will be made, and the total donation from that particular donor. After all individual donor data has been listed, display the grand total of all donations made from all donors.</p>
<p>Required validation &amp; formatting: the amount of each donation must be at least $5.00. At least 1 donation must be made. The amount donated, the total donation, and the grand total of donations must be formatted for currency using NumberFormat class.</p>
