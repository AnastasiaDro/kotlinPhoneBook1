import java.util.*

class PhoneBook()  {

    private var contArr = arrayOfNulls<Contact>(8)
    private var elemNum = 0

    fun addContact(contact: Contact) {
        contArr[elemNum % 8] = contact
        elemNum++
    }

    fun showContacts() {
        val i = contArr.size
        var j = 0
        var contact : Contact
        while (j < i && contArr[j] != null){
            contact = contArr[j]!!
            println("$j ${contact.getName()} ${contact.getSecName()} ${contact.getNickName()}")
        }
    }



    fun generateContact(): Contact {
        val name: String
        val secName: String
        val nickName: String
        val phone: Int
        val secret: String

        val scan = Scanner(System.`in`)
        print("Enter the first name: ")
        name = scan.next()
        print("Enter the second name: ")
        secName = scan.next()
        print("Enter the nickname: ")
        nickName = scan.next()
        print("Enter the phone number: ")
        phone = scan.nextInt()
        print("shhhhhh ... Enter the ... darkest secret! ")
        secret = scan.next()
        scan.close()
        return Contact(name, secName, nickName, phone, secret)

    }
}