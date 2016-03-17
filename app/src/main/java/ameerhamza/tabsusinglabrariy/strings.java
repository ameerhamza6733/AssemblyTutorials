package ameerhamza.tabsusinglabrariy;

/**
 * Created by DELL 3542 on 3/10/2016.
 */
public class strings  {
    public static final String [] programs = {"these examples are designed for emu8086 assembler and microprocessor emulator.",
            "\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "; skip data:\n" +
                    "jmp     code\n" +
                    "\n" +
                    "\n" +
                    "len     equ     32\n" +
                    "\n" +
                    "num1    db      0,0,4,2,3,4,5,4,6,1,2,3,6,1,2,3,4,5,1,2,3,4,4,5,3,5,1,7,9,5,2,1\n" +
                    "\n" +
                    "num2    db      0,0,7,1,2,3,7,8,8,4,7,7,7,1,9,8,1,1,2,3,5,1,3,1,3,7,8,8,2,4,9,8\n" +
                    "\n" +
                    "\n" +
                    "sum     db      len dup(0) ; declare array to keep the result.\n" +
                    "\n" +
                    "code:   nop \n" +
                    "\n" +
                    "\n" +
                    "xor     bx, bx\n" +
                    "\n" +
                    "\n" +
                    "mov     cx, len \n" +
                    "mov \tbx, len-1 \n" +
                    "        \n" +
                    "next_digit:\n" +
                    "\n" +
                    "        ; add digits:\n" +
                    "        mov     al, num1[bx]\n" +
                    "        adc     al, num2[bx]\n" +
                    "        \n" +
                    "      \n" +
                    "        aaa\n" +
                    "        \n" +
                    "        \n" +
                    "        \n" +
                    "        \n" +
                    "        mov     sum[bx], al\n" +
                    "        \n" +
                    "    \n" +
                    "        dec     bx\n" +
                    "        \n" +
                    "        loop    next_digit\n" +
                    "\n" +
                    "adc     sum[bx], 0\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "mov     cx, len\n" +
                    "\n" +
                    "mov     bx, 0\n" +
                    "\n" +
                    "print_d:\n" +
                    "        mov     al, sum[bx]\n" +
                    "        \n" +
                    "        or      al, 30h\n" +
                    "\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h\n" +
                    "        \n" +
                    "        inc     bx\n" +
                    "        \n" +
                    "        loop    print_d\n" +
                    "\n" +
                    "\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret  ; stop\n" +
                    "\n" +
                    "                                                  \n" +
                    "                                                  \n" +
                    "                                                  \n" +
                    "\n" ,


            "name \"vga\"\n" +
                    "\n" +
                    "; this program draws a tiny rectangle in vga mode.\n" +
                    "\n" +
                    "org  100h\n" +
                    "\n" +
                    "jmp code\n" +
                    "\n" +
                    "; dimensions of the rectangle:\n" +
                    "; width: 10 pixels\n" +
                    "; height: 5 pixels\n" +
                    "\n" +
                    "w equ 10\n" +
                    "h equ 5\n" +
                    "\n" +
                    "\n" +
                    "; set video mode 13h - 320x200\n" +
                    "\n" +
                    "code:   mov ah, 0\n" +
                    "        mov al, 13h \n" +
                    "        int 10h\n" +
                    "\n" +
                    "\n" +
                    "; draw upper line:\n" +
                    "\n" +
                    "    mov cx, 100+w  ; column\n" +
                    "    mov dx, 20     ; row\n" +
                    "    mov al, 15     ; white\n" +
                    "u1: mov ah, 0ch    ; put pixel\n" +
                    "    int 10h\n" +
                    "    \n" +
                    "    dec cx\n" +
                    "    cmp cx, 100\n" +
                    "    jae u1\n" +
                    " \n" +
                    "; draw bottom line:\n" +
                    "\n" +
                    "    mov cx, 100+w  ; column\n" +
                    "    mov dx, 20+h   ; row\n" +
                    "    mov al, 15     ; white\n" +
                    "u2: mov ah, 0ch    ; put pixel\n" +
                    "    int 10h\n" +
                    "    \n" +
                    "    dec cx\n" +
                    "    cmp cx, 100\n" +
                    "    ja u2\n" +
                    " \n" +
                    "; draw left line:\n" +
                    "\n" +
                    "    mov cx, 100    ; column\n" +
                    "    mov dx, 20+h   ; row\n" +
                    "    mov al, 15     ; white\n" +
                    "u3: mov ah, 0ch    ; put pixel\n" +
                    "    int 10h\n" +
                    "    \n" +
                    "    dec dx\n" +
                    "    cmp dx, 20\n" +
                    "    ja u3 \n" +
                    "    \n" +
                    "    \n" +
                    "; draw right line:\n" +
                    "\n" +
                    "    mov cx, 100+w  ; column\n" +
                    "    mov dx, 20+h   ; row\n" +
                    "    mov al, 15     ; white\n" +
                    "u4: mov ah, 0ch    ; put pixel\n" +
                    "    int 10h\n" +
                    "    \n" +
                    "    dec dx\n" +
                    "    cmp dx, 20\n" +
                    "    ja u4     \n" +
                    " \n" +
                    "\n" +
                    "; pause the screen for dos compatibility:\n" +
                    "\n" +
                    ";wait for keypress\n" +
                    "  mov ah,00\n" +
                    "  int 16h\t\t\t\n" +
                    "\n" +
                    "; return to text mode:\n" +
                    "  mov ah,00\n" +
                    "  mov al,03 ;text mode 3\n" +
                    "  int 10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n",


            "name \"hi-world\"\n" +
                    "\n" +
                    "; this example prints out  \"hello world!\"\n" +
                    "; by writing directly to video memory.\n" +
                    "; in vga memory: first byte is ascii character, byte that follows is character attribute.\n" +
                    "; if you change the second byte, you can change the color of\n" +
                    "; the character even after it is printed.\n" +
                    "; character attribute is 8 bit value,\n" +
                    "; high 4 bits set background color and low 4 bits set foreground color.\n" +
                    "\n" +
                    "; hex    bin        color\n" +
                    "; \n" +
                    "; 0      0000      black\n" +
                    "; 1      0001      blue\n" +
                    "; 2      0010      green\n" +
                    "; 3      0011      cyan\n" +
                    "; 4      0100      red\n" +
                    "; 5      0101      magenta\n" +
                    "; 6      0110      brown\n" +
                    "; 7      0111      light gray\n" +
                    "; 8      1000      dark gray\n" +
                    "; 9      1001      light blue\n" +
                    "; a      1010      light green\n" +
                    "; b      1011      light cyan\n" +
                    "; c      1100      light red\n" +
                    "; d      1101      light magenta\n" +
                    "; e      1110      yellow\n" +
                    "; f      1111      white\n" +
                    " \n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "; set video mode    \n" +
                    "mov ax, 3     ; text mode 80x25, 16 colors, 8 pages (ah=0, al=3)\n" +
                    "int 10h       ; do it!\n" +
                    "\n" +
                    "; cancel blinking and enable all 16 colors:\n" +
                    "mov ax, 1003h\n" +
                    "mov bx, 0\n" +
                    "int 10h\n" +
                    "\n" +
                    "\n" +
                    "; set segment register:\n" +
                    "mov     ax, 0b800h\n" +
                    "mov     ds, ax\n" +
                    "\n" +
                    "; print \"hello world\"\n" +
                    "; first byte is ascii code, second byte is color code.\n" +
                    "\n" +
                    "mov [02h], 'H'\n" +
                    "\n" +
                    "mov [04h], 'e'\n" +
                    "\n" +
                    "mov [06h], 'l'\n" +
                    "\n" +
                    "mov [08h], 'l'\n" +
                    "\n" +
                    "mov [0ah], 'o'\n" +
                    "\n" +
                    "mov [0ch], ','\n" +
                    "\n" +
                    "mov [0eh], 'W'\n" +
                    " \n" +
                    "mov [10h], 'o'\n" +
                    "\n" +
                    "mov [12h], 'r'\n" +
                    "\n" +
                    "mov [14h], 'l'\n" +
                    "\n" +
                    "mov [16h], 'd'\n" +
                    "\n" +
                    "mov [18h], '!'\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; color all characters:\n" +
                    "mov cx, 12  ; number of characters.\n" +
                    "mov di, 03h ; start from byte after 'h'\n" +
                    "\n" +
                    "c:  mov [di], 11101100b   ; light red(1100) on yellow(1110)\n" +
                    "    add di, 2 ; skip over next ascii code in vga memory.\n" +
                    "    loop c\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n",

            "name \"add-sub\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "mov al, 5       ; bin=00000101b\n" +
                    "mov bl, 10      ; hex=0ah or bin=00001010b\n" +
                    "\n" +
                    "; 5 + 10 = 15 (decimal) or hex=0fh or bin=00001111b\n" +
                    "add bl, al\n" +
                    "\n" +
                    "; 15 - 1 = 14 (decimal) or hex=0eh or bin=00001110b\n" +
                    "sub bl, 1\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov cx, 8\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bl, 10000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bl, 1\n" +
                    "loop print\n" +
                    "\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n",

            "name \"calc-sum\"\n" +
                    "\n" +
                    "org 100h ; directive make tiny com file.\n" +
                    "\n" +
                    "; calculate the sum of elements in vector,\n" +
                    "; store result in m and print it in binary code.\n" +
                    "\n" +
                    "; number of elements:\n" +
                    "mov cx, 5\n" +
                    "\n" +
                    "; al will store the sum:\n" +
                    "mov al, 0\n" +
                    "\n" +
                    "; bx is an index:\n" +
                    "mov bx, 0\n" +
                    "\n" +
                    "; sum elements:\n" +
                    "next: add al, vector[bx]\n" +
                    "\n" +
                    "; next byte:\n" +
                    "inc bx\n" +
                    "\n" +
                    "; loop until cx=0:\n" +
                    "loop next\n" +
                    "\n" +
                    "\n" +
                    "; store result in m:  \n" +
                    "mov m, al\n" +
                    "\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov bl, m\n" +
                    "mov cx, 8\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bl, 10000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bl, 1\n" +
                    "loop print\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "mov dl, 0ah ; new line.\n" +
                    "int 21h\n" +
                    "mov dl, 0dh ; carrige return.\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; print result in decimal:\n" +
                    "mov al, m\n" +
                    "call print_al\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "; variables:\n" +
                    "vector db 5, 4, 5, 2, 1\n" +
                    "m db 0\n" +
                    "\n" +
                    "\n" +
                    "print_al proc\n" +
                    "cmp al, 0\n" +
                    "jne print_al_r\n" +
                    "    push ax\n" +
                    "    mov al, '0'\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h\n" +
                    "    pop ax\n" +
                    "    ret \n" +
                    "print_al_r:    \n" +
                    "    pusha\n" +
                    "    mov ah, 0\n" +
                    "    cmp ax, 0\n" +
                    "    je pn_done\n" +
                    "    mov dl, 10\n" +
                    "    div dl    \n" +
                    "    call print_al_r\n" +
                    "    mov al, ah\n" +
                    "    add al, 30h\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h    \n" +
                    "    jmp pn_done\n" +
                    "pn_done:\n" +
                    "    popa  \n" +
                    "    ret  \n" +
                    "endp",


            "name \"flags\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "; this sample shows how cmp instruction sets the flags.\n" +
                    "\n" +
                    "; usually cmp instruction is followed by any relative\n" +
                    "; jump instruction such as: je, ja, jl, jae...\n" +
                    "\n" +
                    "; it is recommended to click \"flags\" and \"analyze\"\n" +
                    "; for better visual expirience before stepping through this code.\n" +
                    "\n" +
                    "; (signed/unsigned)\n" +
                    "; 4 is equal to 4\n" +
                    "mov ah, 4\n" +
                    "mov al, 4\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; (signed/unsigned)\n" +
                    "; 4 is above and greater then 3\n" +
                    "mov ah, 4\n" +
                    "mov al, 3\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; -5 = 251 = 0fbh\n" +
                    "\n" +
                    "; (signed)\n" +
                    "; 1 is greater then -5\n" +
                    "mov ah, 1\n" +
                    "mov al, -5\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; (unsigned)\n" +
                    "; 1 is below 251\n" +
                    "mov ah, 1\n" +
                    "mov al, 251\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; (signed)\n" +
                    "; -3 is less then -2\n" +
                    "mov ah, -3\n" +
                    "mov al, -2\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; (signed)\n" +
                    "; -2 is greater then -3\n" +
                    "mov ah, -2\n" +
                    "mov al, -3\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; (unsigned)\n" +
                    "; 255 is above 1\n" +
                    "mov ah, 255\n" +
                    "mov al, 1\n" +
                    "cmp ah, al\n" +
                    "nop\n" +
                    "\n" +
                    "; now a little game:\n" +
                    "game:  mov dx, offset msg1\n" +
                    "       mov ah, 9\n" +
                    "       int 21h\n" +
                    "\n" +
                    "       ; read character in al:\n" +
                    "       mov ah, 1 \n" +
                    "       int 21h\n" +
                    "\n" +
                    "       cmp al, '0'\n" +
                    "       jb stop\n" +
                    "\n" +
                    "       cmp al, '9'\n" +
                    "       ja stop\n" +
                    "\n" +
                    "       cmp al, '5'\n" +
                    "       jb below\n" +
                    "       ja above\n" +
                    "       mov dx, offset equal_5\n" +
                    "       jmp print\n" +
                    "below: mov dx, offset below_5     \n" +
                    "       jmp print\n" +
                    "above: mov dx, offset above_5\n" +
                    "print: mov ah, 9\n" +
                    "       int 21h\n" +
                    "       jmp game  ; loop.\n" +
                    "\n" +
                    "\n" +
                    "stop: ret  ; stop\n" +
                    "\n" +
                    "\n" +
                    "msg1 db \"enter a number or any other character to exit:  $\"\n" +
                    "equal_5 db \" is five! (equal)\", 0Dh,0Ah, \"$\"\n" +
                    "below_5 db \" is below five!\" , 0Dh,0Ah, \"$\"\n" +
                    "above_5 db \" is above five!\" , 0Dh,0Ah, \"$\"\n" +
                    "\n" +
                    "\n",


            "name \"hex-bin\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "; load binary value:\n" +
                    "; (hex: 5h)\n" +
                    "mov al, 00000101b\n" +
                    "\n" +
                    "; load hex value:\n" +
                    "mov bl, 0ah\n" +
                    "\n" +
                    "; load octal value:\n" +
                    "; (hex: 8h)\n" +
                    "mov cl, 10o\n" +
                    "\n" +
                    "; 5 + 10 = 15 (0fh)\n" +
                    "add al, bl\n" +
                    "\n" +
                    "; 15 - 8 = 7\n" +
                    "sub al, cl\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov bl, al\n" +
                    "mov cx, 8\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bl, 10000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bl, 1\n" +
                    "loop print\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",

            "name \"add-2\"\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\"; this example calculates the sum of a vector with\\n\" +\n" +
                    "\"; another vector and saves result in third vector.\\n\" +\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "vec1 db 1, 2, 5, 6\n" +
                    "vec2 db 3, 5, 6, 1\n" +
                    "vec3 db ?, ?, ?, ?   \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "lea si, vec1\n" +
                    "lea bx, vec2\n" +
                    "lea di, vec3  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "mov cx, 4  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "sum:       \n" +
                    "    mov al, [si]\n" +
                    "    add al, [bx]\n" +
                    "    mov [di], al \n" +
                    "    \n" +
                    "    \n" +
                    "   \n" +
                    "    inc si\n" +
                    "    inc bx\n" +
                    "    inc di \n" +
                    "    \n" +
                    "    \n" +
                    "   \n" +
                    "    loop sum\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n",


            "\n" +
                    "name \"attrib\"\n" +
                    "\n" +
                    "; set and get file attributes...\n" +
                    "\n" +
                    "; note 1: you need to manually create and copy \"test.txt\" to:\n" +
                    "; c:\\emu8086\\vdrive\\c before running this example.\n" +
                    "\n" +
                    "; note 2: it may look like the file suddenly disappears unless\n" +
                    "; you set the settings of file manager to show system and hidden files. \n" +
                    "\n" +
                    "; note 3: file must exist for setting parameters. however reading\n" +
                    "; parameters does not require the existance of a file and\n" +
                    "; it is usually used to check if file exists or not.\n" +
                    "\n" +
                    "org  100h\n" +
                    "\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "  filename   db      \"c:\\test.txt\", 0\n" +
                    "  sOK        db      \"ok! file found. attributes set: system, hidden & read-only. $\"\n" +
                    "  sERR       db      \"file does not exist. (expected i/o error)\", 0dh, 0ah\n" +
                    "             db      ' you need to manually create and copy \"test.txt\" to:', 0dh, 0ah\n" +
                    "             db      ' \"c:\\emu8086\\vdrive\\c\"  before running this example.$ '\n" +
                    "  \n" +
                    "; when running in emulator, the real path of this file is:\n" +
                    ";           c:\\emu8086\\vdrive\\c\\test.txt\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "xor cx, cx\n" +
                    "\n" +
                    "; read attributes:\n" +
                    "mov     ah, 43h\n" +
                    "mov     al, 0\n" +
                    "mov     dx, offset filename\n" +
                    "int     21h\n" +
                    "jc      error\n" +
                    "; set new attributes:\n" +
                    "mov     ah, 43h\n" +
                    "mov     al, 1\n" +
                    "mov     cx, 7\n" +
                    "mov     dx, offset filename\n" +
                    "int     21h\n" +
                    "jc      error\n" +
                    "\n" +
                    "mov dx, offset sOK\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "jmp wait_any_key\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "error:\n" +
                    "    mov dx, offset sERR\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "wait_any_key:\n" +
                    "    mov ah, 0\n" +
                    "    int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n",



            "\n" +
                    "\n" +
                    "name \"bcd_aaa\"\n" +
                    "\n" +
                    "org     100h  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; first number '9':\n" +
                    "mov     ah, 09h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; second number '5':\n" +
                    "mov     al, 05h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; al = al + ah \n" +
                    "add     al, ah  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; clear tens byte of bcd\n" +
                    "; result:\n" +
                    "xor     ah, ah \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; adjust result to bcd form,\n" +
                    "aaa  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; print the result:\n" +
                    "mov     dx, ax  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; print first digit:\n" +
                    "mov     ah, 0eh \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; convert to ascii:\n" +
                    "or      dh, 30h\n" +
                    "mov     al, dh\n" +
                    "int     10h\n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    "; print second digit:\n" +
                    "; convert to ascii:\n" +
                    "or      dl, 30h\n" +
                    "mov     al, dl\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ret  ; return control to operating system.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" ,




            "; aas instruction, \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "name \"bcd_aas\"   \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org\t100h  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; make 5 - 8\n" +
                    "mov\tal, 05h\n" +
                    "mov\tbl, 08h\n" +
                    "sub\tal, bl\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; convert to binary coded decimal,\n" +
                    "; al = 7\n" +
                    "; and 1 is borrowed from ah, like calculating 15 - 8:\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "aas \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; convert to printable symbol:\n" +
                    "or\tal, 30h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; print char in al using bios teletype function:\n" +
                    "mov\tah, 0eh\n" +
                    "int\t10h   \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ret  ; return control to operating system.\n" +
                    "\n ",





            "; input8 bit binary number and print out decimal to screen.\n" +
                    "; zeros and ones -> decimal value\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ORG 100h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "PUTC    MACRO   char\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AL, char\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        \n" +
                    "        \n" +
                    "\n" +
                    "\n" +
                    "INT     10h     \n" +
                    "POP     AX\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "        \n" +
                    "ENDM \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ".data\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; null terminated input string:\n" +
                    "DB \"0\"\n" +
                    "s1 DB \"00000000\", 0\n" +
                    "sum DW 0  ; result.\n" +
                    "flag DB 0\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ".code\n" +
                    "CALL print\n" +
                    "DB 0dh, 0ah, \"8 bit binary: \", 0\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; get string:\n" +
                    "MOV DX, 9 \n" +
                    "\n" +
                    "  \n" +
                    "  \n" +
                    "  \n" +
                    "LEA DI, s1\n" +
                    "CALL GET_STRING\n" +
                    "  \n" +
                    "  \n" +
                    "  \n" +
                    "\n" +
                    "; check that we really got 8 zeros and ones\n" +
                    "MOV CX, 8\n" +
                    "MOV SI, OFFSET s1\n" +
                    "check_s:\n" +
                    "CMP [SI], 0 \n" +
                    "JNE ok0         \n" +
                    "       \n" +
                    "       \n" +
                    "       \n" +
                    "       \n" +
                    "MOV flag, 1     ; terminated.\n" +
                    "JMP convert\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ok0:\n" +
                    "CMP [SI], 'b' \n" +
                    "JNE ok1         \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    "MOV flag, 1     ; terminated.\n" +
                    "JMP convert        \n" +
                    "ok1:    \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; wrong digit? Not 1/0?\n" +
                    "CMP [SI], 31h\n" +
                    "JNA ok2\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "JMP error_not_valid     \n" +
                    "ok2:\n" +
                    "INC SI\n" +
                    "LOOP check_s\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";conversion from string to value in SUM variable.\n" +
                    "convert:\n" +
                    "MOV BL, 1   ; multiplier.\n" +
                    "MOV CX, SI\n" +
                    "SUB CX, OFFSET s1\n" +
                    "DEC SI\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "JCXZ stop_program\n" +
                    "\n" +
                    "next_digit:\n" +
                    "    MOV AL, [SI]  ; get digit.\n" +
                    "    SUB AL, 30h\n" +
                    "    MUL BL      ; no change to AX.\n" +
                    "    ADD SUM, AX\n" +
                    "    SHL BL, 1\n" +
                    "    DEC SI          ; go to previous digit.\n" +
                    "    LOOP next_digit\n" +
                    "\n" +
                    "; done! converted number is in SUM.\n" +
                    "\n" +
                    "; check if signed\n" +
                    "TEST sum, 0000_0000_1000_0000b\n" +
                    "JNZ  print_signed_unsigned\n" +
                    "\n" +
                    "print_unsigned:\n" +
                    "CALL print\n" +
                    "DB 0dh, 0ah, \"decimal: \", 0\n" +
                    "MOV  AX, SUM\n" +
                    "CALL PRINT_NUM_UNS\n" +
                    "JMP  stop_program\n" +
                    "\n" +
                    "print_signed_unsigned:\n" +
                    "CALL print\n" +
                    "DB 0dh, 0ah, \"unsigned decimal: \", 0\n" +
                    "; print out unsigned:\n" +
                    "MOV  AX, SUM\n" +
                    "CALL PRINT_NUM_UNS\n" +
                    "CALL print\n" +
                    "DB 0dh, 0ah, \"signed decimal: \", 0\n" +
                    "; print out singed:\n" +
                    "MOV  AX, SUM\n" +
                    "CBW  ; convert byte into word.\n" +
                    "CALL PRINT_NUM\n" +
                    "JMP  stop_program\n" +
                    "\n" +
                    "\n" +
                    "error_not_valid:\n" +
                    "CALL print\n" +
                    "DB 0dh, 0ah, \"error: only zeros and ones are allowed!\", 0\n" +
                    "\n" +
                    "stop_program:\n" +
                    "\n" +
                    "; wait for any key....\n" +
                    "CALL print\n" +
                    "DB 0dh, 0ah, \"press any key...\", 0\n" +
                    "MOV AH, 0\n" +
                    "INT 16h\n" +
                    "RET\n" +
                    "\n" +
                    "\n" +
                    "; procedures\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; copied from c:\\emu8086\\emu8086.inc\n" +
                    "GET_STRING      PROC    NEAR\n" +
                    "PUSH    AX\n" +
                    "PUSH    CX\n" +
                    "PUSH    DI\n" +
                    "PUSH    DX\n" +
                    "\n" +
                    "MOV     CX, 0                   ; char counter.\n" +
                    "\n" +
                    "CMP     DX, 1                   ; buffer too small?\n" +
                    "JBE     empty_buffer            ;\n" +
                    "\n" +
                    "DEC     DX                      ; reserve space for last zero.\n" +
                    "\n" +
                    "\n" +
                    ";============================\n" +
                    "; loop to get and processes key presses:\n" +
                    "\n" +
                    "wait_for_key:\n" +
                    "\n" +
                    "MOV     AH, 0                   ; get pressed key.\n" +
                    "INT     16h\n" +
                    "\n" +
                    "CMP     AL, 13                  ; 'RETURN' pressed?\n" +
                    "JZ      exit\n" +
                    "\n" +
                    "\n" +
                    "CMP     AL, 8                   ; 'BACKSPACE' pressed?\n" +
                    "JNE     add_to_buffer\n" +
                    "JCXZ    wait_for_key            ; nothing to remove!\n" +
                    "DEC     CX\n" +
                    "DEC     DI\n" +
                    "PUTC    8                       ; backspace.\n" +
                    "PUTC    ' '                     ; clear position.\n" +
                    "PUTC    8                       ; backspace again.\n" +
                    "JMP     wait_for_key\n" +
                    "\n" +
                    "add_to_buffer:\n" +
                    "\n" +
                    "        CMP     CX, DX          ; buffer is full?\n" +
                    "        JAE     wait_for_key    ; if so wait for 'BACKSPACE' or 'RETURN'...\n" +
                    "\n" +
                    "        MOV     [DI], AL\n" +
                    "        INC     DI\n" +
                    "        INC     CX\n" +
                    "        \n" +
                    "        ; print the key:\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "JMP     wait_for_key\n" +
                    ";============================\n" +
                    "\n" +
                    "exit:\n" +
                    "\n" +
                    "; terminate by null:\n" +
                    "MOV     [DI], 0\n" +
                    "\n" +
                    "empty_buffer:\n" +
                    "\n" +
                    "POP     DX\n" +
                    "POP     DI\n" +
                    "POP     CX\n" +
                    "POP     AX\n" +
                    "RET\n" +
                    "GET_STRING      ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; copied from c:\\emu8086\\emu8086.inc\n" +
                    "PRINT_NUM       PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "\n" +
                    "        CMP     AX, 0\n" +
                    "        JNZ     not_zero\n" +
                    "\n" +
                    "        PUTC    '0'\n" +
                    "        JMP     printed_pn\n" +
                    "\n" +
                    "not_zero:\n" +
                    "        ; the check SIGN of AX,\n" +
                    "        ; make absolute if it's negative:\n" +
                    "        CMP     AX, 0\n" +
                    "        JNS     positive\n" +
                    "        NEG     AX\n" +
                    "\n" +
                    "        PUTC    '-'\n" +
                    "\n" +
                    "positive:\n" +
                    "        CALL    PRINT_NUM_UNS\n" +
                    "printed_pn:\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; copied from c:\\emu8086\\emu8086.inc\n" +
                    "PRINT_NUM_UNS   PROC    NEAR\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    BX\n" +
                    "        PUSH    CX\n" +
                    "        PUSH    DX\n" +
                    "\n" +
                    "        ; flag to prevent printing zeros before number:\n" +
                    "        MOV     CX, 1\n" +
                    "\n" +
                    "        ; (result of \"/ 10000\" is always less or equal to 9).\n" +
                    "        MOV     BX, 10000       ; 2710h - divider.\n" +
                    "\n" +
                    "        ; AX is zero?\n" +
                    "        CMP     AX, 0\n" +
                    "        JZ      print_zero\n" +
                    "\n" +
                    "begin_print:\n" +
                    "\n" +
                    "        ; check divider (if zero go to end_print):\n" +
                    "        CMP     BX,0\n" +
                    "        JZ      end_print\n" +
                    "\n" +
                    "        ; avoid printing zeros before number:\n" +
                    "        CMP     CX, 0\n" +
                    "        JE      calc\n" +
                    "        ; if AX<BX then result of DIV will be zero:\n" +
                    "        CMP     AX, BX\n" +
                    "        JB      skip\n" +
                    "calc:\n" +
                    "        MOV     CX, 0   ; set flag.\n" +
                    "\n" +
                    "        MOV     DX, 0\n" +
                    "        DIV     BX      ; AX = DX:AX / BX   (DX=remainder).\n" +
                    "\n" +
                    "        ; print last digit\n" +
                    "        ; AH is always ZERO, so it's ignored\n" +
                    "        ADD     AL, 30h    ; convert to ASCII code.\n" +
                    "        PUTC    AL\n" +
                    "\n" +
                    "\n" +
                    "        MOV     AX, DX  ; get remainder from last div.\n" +
                    "\n" +
                    "skip:\n" +
                    "        ; calculate BX=BX/10\n" +
                    "        PUSH    AX\n" +
                    "        MOV     DX, 0\n" +
                    "        MOV     AX, BX\n" +
                    "        DIV     CS:ten  ; AX = DX:AX / 10   (DX=remainder).\n" +
                    "        MOV     BX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        JMP     begin_print\n" +
                    "        \n" +
                    "print_zero:\n" +
                    "        PUTC    '0'\n" +
                    "        \n" +
                    "end_print:\n" +
                    "\n" +
                    "        POP     DX\n" +
                    "        POP     CX\n" +
                    "        POP     BX\n" +
                    "        POP     AX\n" +
                    "        RET\n" +
                    "ten             DW      10      ; used as divider.      \n" +
                    "ENDP\n" +
                    "\n" +
                    "\n" +
                    "; print text that follows the caller\n" +
                    "print PROC\n" +
                    "MOV     CS:temp1, SI  ; store SI register.\n" +
                    "POP     SI            ; get return address (IP).\n" +
                    "PUSH    AX            ; store AX register.\n" +
                    "next_char:      \n" +
                    "        MOV     AL, CS:[SI]\n" +
                    "        INC     SI            ; next byte.\n" +
                    "        CMP     AL, 0\n" +
                    "        JZ      printed_ok\n" +
                    "        MOV     AH, 0Eh       ; teletype function.\n" +
                    "        INT     10h\n" +
                    "        JMP     next_char     ; loop.\n" +
                    "printed_ok:\n" +
                    "POP     AX            ; re-store AX register.\n" +
                    "; SI should point to next command after\n" +
                    "; the CALL instruction and string definition:\n" +
                    "PUSH    SI            ; save new return address into the Stack.\n" +
                    "MOV     SI, CS:temp1  ; re-store SI register.\n" +
                    "RET\n" +
                    "temp1  DW  ?    ; variable to store original value of SI register.\n" +
                    "ENDP",



            ";make a \".bin\" file.\n" +
                    "\n" +
                    "\n" +
                    "name \"bintest\"\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; directive to create bin file:\n" +
                    "#make_bin#\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; where to load?\n" +
                    "#load_segment=1234#\n" +
                    "#load_offset=0000#\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; set these values to registers on load:\n" +
                    "#al=12#\n" +
                    "#ah=34#\n" +
                    "#bh=56#\n" +
                    "#bl=78#\n" +
                    "#ch=9a#\n" +
                    "#cl=bc#\n" +
                    "#dh=de#\n" +
                    "#dl=f0#\n" +
                    "#ds=ddee#\n" +
                    "#es=abcd#\n" +
                    "#si=aaaa#\n" +
                    "#di=cccc#\n" +
                    "#bp=dddd#\n" +
                    "#cs=1234#\n" +
                    "#ip=0000#\n" +
                    "#ss=3000#\n" +
                    "#sp=ffff#\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; when loading \"bintest.bin\" file in emulator\n" +
                    "; it will look for a \"bintest.binf\" file,\n" +
                    "; and load \".bin\" file to location specified\n" +
                    "; in that file, registers are also set using\n" +
                    "; information in that file (open this file\n" +
                    "; in a text editor to edit or investigate).\n" +
                    ";\n" +
                    "; \".binf\" file is created automatically\n" +
                    "; by compiler when it processes the above\n" +
                    "; directives.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this sample just prints out a part of\n" +
                    "; some ascii character set, in an eternal\n" +
                    "; loop, press [stop] or esc to terminate.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "mov     al, '0'\n" +
                    "mov     ah, 0eh\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "print_more:\n" +
                    "int     10h\n" +
                    "inc     al\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; keep original ax:\n" +
                    "mov     cx, ax\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";============================\n" +
                    "; check for esc key to\n" +
                    ";    reboot:\n" +
                    "\n" +
                    "; check for keystroke in\n" +
                    "; keyboard buffer:\n" +
                    "\n" +
                    "mov     ah, 1\n" +
                    "int     16h\n" +
                    "jz      key_processed\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; get keystroke from keyboard:\n" +
                    "; (remove from the buffer)\n" +
                    "mov     ah, 0\n" +
                    "int     16h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; press 'esc' to exit:\n" +
                    "cmp     al, 27\n" +
                    "jnz     key_processed\n" +
                    "hlt\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "key_processed:\n" +
                    ";============================\n" +
                    "\n" +
                    "; restore original ax:\n" +
                    "mov     ax, cx\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "cmp     al, 'z'\n" +
                    "jbe     print_more\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "mov     al, '0'\n" +
                    "jmp     print_more\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",





            ";input from user and print the sum \n" +
                    "name \"calc\"\n" +
                    "          \n" +
                    "          \n" +
                    "          \n" +
                    "          \n" +
                    "          \n" +
                    "          \n" +
                    "\n" +
                    "; this macro prints a string that is given as a parameter, example:\n" +
                    "; PRINTN 'hello world!'\n" +
                    "; the same as PRINT, but new line is automatically added.\n" +
                    "PRINTN   MACRO   sdat\n" +
                    "LOCAL   next_char, s_dcl, printed, skip_dcl\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; store registers...\n" +
                    "PUSH    AX      \n" +
                    "PUSH    SI      ;\n" +
                    "                    \n" +
                    "                    \n" +
                    "                    \n" +
                    "                    \n" +
                    "                    \n" +
                    "; skip declaration.                    \n" +
                    "JMP     skip_dcl        \n" +
                    "s_dcl DB sdat, 0Dh,0Ah, 0\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "skip_dcl:\n" +
                    "LEA     SI, s_dcl\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "        \n" +
                    "next_char:      \n" +
                    "MOV     AL, CS:[SI]\n" +
                    "CMP     AL, 0\n" +
                    "JZ      printed\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "INC     SI\n" +
                    "MOV     AH, 0Eh ; teletype function.\n" +
                    "INT     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "JMP     next_char\n" +
                    "printed:\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "POP     SI      ; re-store registers...\n" +
                    "POP     AX      ;\n" +
                    "ENDM\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this macro prints a char in AL and advances\n" +
                    "; the current cursor position:\n" +
                    "PUTC    MACRO   char\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AL, char\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h     \n" +
                    "        POP     AX\n" +
                    "ENDM\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jmp     start   ; skip data.\n" +
                    "   \n" +
                    "msg1  db 0Dh,0Ah, 'input numbers in this range: [-32768..32767]', 0Dh,0Ah\n" +
                    "      db 0Dh,0Ah, 'enter first number: $'\n" +
                    "\n" +
                    "msg2  db 0Dh,0Ah, 'enter second number: $'\n" +
                    "\n" +
                    "msg3  db 0Dh,0Ah, 'the sum is: $'\n" +
                    "\n" +
                    "; declaration of variable:\n" +
                    "num  dw ?\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "\n" +
                    "; print first message\n" +
                    "mov dx, offset msg1\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "call    scan_num\n" +
                    "\n" +
                    "; keep first number:\n" +
                    "mov     num, cx\n" +
                    "\n" +
                    "\n" +
                    "; print second message\n" +
                    "mov dx, offset msg2\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "call    scan_num\n" +
                    "\n" +
                    "\n" +
                    "; add numbers:\n" +
                    "add     num, cx\n" +
                    "jo      overflow\n" +
                    "\n" +
                    "\n" +
                    "; print the result:\n" +
                    "mov dx, offset msg3\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "mov     ax, num\n" +
                    "call    print_num\n" +
                    "\n" +
                    "jmp     exit\n" +
                    "\n" +
                    "; process overlow error:\n" +
                    "overflow:\n" +
                    "   \n" +
                    "   printn 'we have overflow!'\n" +
                    "\n" +
                    "\n" +
                    "exit:\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret   ; return control to operating system.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    ";;; these functions are copied from emu8086.inc ;;;\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "\n" +
                    "\n" +
                    "; gets the multi-digit SIGNED number from the keyboard,\n" +
                    "; and stores the result in CX register:\n" +
                    "SCAN_NUM        PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    SI\n" +
                    "        \n" +
                    "        MOV     CX, 0\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        MOV     CS:make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "        ; get char from keyboard\n" +
                    "        ; into AL:\n" +
                    "        MOV     AH, 00h\n" +
                    "        INT     16h\n" +
                    "        ; and print it:\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "        ; check for MINUS:\n" +
                    "        CMP     AL, '-'\n" +
                    "        JE      set_minus\n" +
                    "\n" +
                    "        ; check for ENTER key:\n" +
                    "        CMP     AL, 0Dh  ; carriage return?\n" +
                    "        JNE     not_cr\n" +
                    "        JMP     stop_input\n" +
                    "not_cr:\n" +
                    "\n" +
                    "\n" +
                    "        CMP     AL, 8                   ; 'BACKSPACE' pressed?\n" +
                    "        JNE     backspace_checked\n" +
                    "        MOV     DX, 0                   ; remove last digit by\n" +
                    "        MOV     AX, CX                  ; division:\n" +
                    "        DIV     CS:ten                  ; AX = DX:AX / 10 (DX-rem).\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    ' '                     ; clear position.\n" +
                    "        PUTC    8                       ; backspace again.\n" +
                    "        JMP     next_digit\n" +
                    "backspace_checked:\n" +
                    "\n" +
                    "\n" +
                    "        ; allow only digits:\n" +
                    "        CMP     AL, '0'\n" +
                    "        JAE     ok_AE_0\n" +
                    "        JMP     remove_not_digit\n" +
                    "ok_AE_0:        \n" +
                    "        CMP     AL, '9'\n" +
                    "        JBE     ok_digit\n" +
                    "remove_not_digit:       \n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered not digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for next input.       \n" +
                    "ok_digit:\n" +
                    "\n" +
                    "\n" +
                    "        ; multiply CX by 10 (first time the result is zero)\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AX, CX\n" +
                    "        MUL     CS:ten                  ; DX:AX = AX*10\n" +
                    "        MOV     CX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        ; check if the number is too big\n" +
                    "        ; (result should be 16 bits)\n" +
                    "        CMP     DX, 0\n" +
                    "        JNE     too_big\n" +
                    "\n" +
                    "        ; convert from ASCII code:\n" +
                    "        SUB     AL, 30h\n" +
                    "\n" +
                    "        ; add AL to CX:\n" +
                    "        MOV     AH, 0\n" +
                    "        MOV     DX, CX      ; backup, in case the result will be too big.\n" +
                    "        ADD     CX, AX\n" +
                    "        JC      too_big2    ; jump if the number is too big.\n" +
                    "\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "set_minus:\n" +
                    "        MOV     CS:make_minus, 1\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "too_big2:\n" +
                    "        MOV     CX, DX      ; restore the backuped value before add.\n" +
                    "        MOV     DX, 0       ; DX was zero before backup!\n" +
                    "too_big:\n" +
                    "        MOV     AX, CX\n" +
                    "        DIV     CS:ten  ; reverse last DX:AX = AX*10, make AX = DX:AX / 10\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for Enter/Backspace.\n" +
                    "        \n" +
                    "        \n" +
                    "stop_input:\n" +
                    "        ; check flag:\n" +
                    "        CMP     CS:make_minus, 0\n" +
                    "        JE      not_minus\n" +
                    "        NEG     CX\n" +
                    "not_minus:\n" +
                    "\n" +
                    "        POP     SI\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "make_minus      DB      ?       ; used as a flag.\n" +
                    "SCAN_NUM        ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints number in AX,\n" +
                    "; used with PRINT_NUM_UNS to print signed numbers:\n" +
                    "PRINT_NUM       PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "\n" +
                    "        CMP     AX, 0\n" +
                    "        JNZ     not_zero\n" +
                    "\n" +
                    "        PUTC    '0'\n" +
                    "        JMP     printed\n" +
                    "\n" +
                    "not_zero:\n" +
                    "        ; the check SIGN of AX,\n" +
                    "        ; make absolute if it's negative:\n" +
                    "        CMP     AX, 0\n" +
                    "        JNS     positive\n" +
                    "        NEG     AX\n" +
                    "\n" +
                    "        PUTC    '-'\n" +
                    "\n" +
                    "positive:\n" +
                    "        CALL    PRINT_NUM_UNS\n" +
                    "printed:\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "PRINT_NUM       ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints out an unsigned\n" +
                    "; number in AX (not just a single digit)\n" +
                    "; allowed values are from 0 to 65535 (FFFF)\n" +
                    "PRINT_NUM_UNS   PROC    NEAR\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    BX\n" +
                    "        PUSH    CX\n" +
                    "        PUSH    DX\n" +
                    "\n" +
                    "        ; flag to prevent printing zeros before number:\n" +
                    "        MOV     CX, 1\n" +
                    "\n" +
                    "        ; (result of \"/ 10000\" is always less or equal to 9).\n" +
                    "        MOV     BX, 10000       ; 2710h - divider.\n" +
                    "\n" +
                    "        ; AX is zero?\n" +
                    "        CMP     AX, 0\n" +
                    "        JZ      print_zero\n" +
                    "\n" +
                    "begin_print:\n" +
                    "\n" +
                    "        ; check divider (if zero go to end_print):\n" +
                    "        CMP     BX,0\n" +
                    "        JZ      end_print\n" +
                    "\n" +
                    "        ; avoid printing zeros before number:\n" +
                    "        CMP     CX, 0\n" +
                    "        JE      calc\n" +
                    "        ; if AX<BX then result of DIV will be zero:\n" +
                    "        CMP     AX, BX\n" +
                    "        JB      skip\n" +
                    "calc:\n" +
                    "        MOV     CX, 0   ; set flag.\n" +
                    "\n" +
                    "        MOV     DX, 0\n" +
                    "        DIV     BX      ; AX = DX:AX / BX   (DX=remainder).\n" +
                    "\n" +
                    "        ; print last digit\n" +
                    "        ; AH is always ZERO, so it's ignored\n" +
                    "        ADD     AL, 30h    ; convert to ASCII code.\n" +
                    "        PUTC    AL\n" +
                    "\n" +
                    "\n" +
                    "        MOV     AX, DX  ; get remainder from last div.\n" +
                    "\n" +
                    "skip:\n" +
                    "        ; calculate BX=BX/10\n" +
                    "        PUSH    AX\n" +
                    "        MOV     DX, 0\n" +
                    "        MOV     AX, BX\n" +
                    "        DIV     CS:ten  ; AX = DX:AX / 10   (DX=remainder).\n" +
                    "        MOV     BX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        JMP     begin_print\n" +
                    "        \n" +
                    "print_zero:\n" +
                    "        PUTC    '0'\n" +
                    "        \n" +
                    "end_print:\n" +
                    "\n" +
                    "        POP     DX\n" +
                    "        POP     CX\n" +
                    "        POP     BX\n" +
                    "        POP     AX\n" +
                    "        RET\n" +
                    "PRINT_NUM_UNS   ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ten             DW      10      ; used as multiplier/divider by SCAN_NUM & PRINT_NUM_UNS.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",



            "\n" +
                    "name \"calc2\"\n" +
                    "\n" +
                    "; command prompt based simple calculator (+,-,*,/) for 8086.\n" +
                    "; example of calculation:\n" +
                    "; input 1 <- number:   10 \n" +
                    "; input 2 <- operator: - \n" +
                    "; input 3 <- number:   5 \n" +
                    "; ------------------- \n" +
                    ";     10 - 5 = 5 \n" +
                    "; output  -> number:   5\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    ";;; this maro is copied from emu8086.inc ;;;\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "; this macro prints a char in AL and advances\n" +
                    "; the current cursor position:\n" +
                    "PUTC    MACRO   char\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AL, char\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h     \n" +
                    "        POP     AX\n" +
                    "ENDM\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "\n" +
                    "; define variables:\n" +
                    "\n" +
                    "msg0 db \"note: calculator works with integer values only.\",0Dh,0Ah\n" +
                    "     db \"to learn how to output the result of a float division see float.asm in examples\",0Dh,0Ah,'$'\n" +
                    "msg1 db 0Dh,0Ah, 0Dh,0Ah, 'enter first number: $'\n" +
                    "msg2 db \"enter the operator:    +  -  *  /     : $\"\n" +
                    "msg3 db \"enter second number: $\"\n" +
                    "msg4 db  0dh,0ah , 'the approximate result of my calculations is : $' \n" +
                    "msg5 db  0dh,0ah ,'thank you for using the calculator! press any key... ', 0Dh,0Ah, '$'\n" +
                    "err1 db  \"wrong operator!\", 0Dh,0Ah , '$'\n" +
                    "smth db  \" and something.... $\"\n" +
                    "\n" +
                    "; operator can be: '+','-','*','/' or 'q' to exit in the middle.\n" +
                    "opr db '?'\n" +
                    "\n" +
                    "; first and second number:\n" +
                    "num1 dw ?\n" +
                    "num2 dw ?\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "mov dx, offset msg0\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "lea dx, msg1\n" +
                    "mov ah, 09h    ; output string at ds:dx\n" +
                    "int 21h  \n" +
                    "\n" +
                    "\n" +
                    "; get the multi-digit signed number\n" +
                    "; from the keyboard, and store\n" +
                    "; the result in cx register:\n" +
                    "\n" +
                    "call scan_num\n" +
                    "\n" +
                    "; store first number:\n" +
                    "mov num1, cx \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; new line:\n" +
                    "putc 0Dh\n" +
                    "putc 0Ah\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "lea dx, msg2\n" +
                    "mov ah, 09h     ; output string at ds:dx\n" +
                    "int 21h  \n" +
                    "\n" +
                    "\n" +
                    "; get operator:\n" +
                    "mov ah, 1   ; single char input to AL.\n" +
                    "int 21h\n" +
                    "mov opr, al\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; new line:\n" +
                    "putc 0Dh\n" +
                    "putc 0Ah\n" +
                    "\n" +
                    "\n" +
                    "cmp opr, 'q'      ; q - exit in the middle.\n" +
                    "je exit\n" +
                    "\n" +
                    "cmp opr, '*'\n" +
                    "jb wrong_opr\n" +
                    "cmp opr, '/'\n" +
                    "ja wrong_opr\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; output of a string at ds:dx\n" +
                    "lea dx, msg3\n" +
                    "mov ah, 09h\n" +
                    "int 21h  \n" +
                    "\n" +
                    "\n" +
                    "; get the multi-digit signed number\n" +
                    "; from the keyboard, and store\n" +
                    "; the result in cx register:\n" +
                    "\n" +
                    "call scan_num\n" +
                    "\n" +
                    "\n" +
                    "; store second number:\n" +
                    "mov num2, cx \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "lea dx, msg4\n" +
                    "mov ah, 09h      ; output string at ds:dx\n" +
                    "int 21h  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; calculate:\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "cmp opr, '+'\n" +
                    "je do_plus\n" +
                    "\n" +
                    "cmp opr, '-'\n" +
                    "je do_minus\n" +
                    "\n" +
                    "cmp opr, '*'\n" +
                    "je do_mult\n" +
                    "\n" +
                    "cmp opr, '/'\n" +
                    "je do_div\n" +
                    "\n" +
                    "\n" +
                    "; none of the above....\n" +
                    "wrong_opr:\n" +
                    "lea dx, err1\n" +
                    "mov ah, 09h     ; output string at ds:dx\n" +
                    "int 21h  \n" +
                    "\n" +
                    "\n" +
                    "exit:\n" +
                    "; output of a string at ds:dx\n" +
                    "lea dx, msg5\n" +
                    "mov ah, 09h\n" +
                    "int 21h  \n" +
                    "\n" +
                    "\n" +
                    "; wait for any key...\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret  ; return back to os.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "do_plus:\n" +
                    "\n" +
                    "\n" +
                    "mov ax, num1\n" +
                    "add ax, num2\n" +
                    "call print_num    ; print ax value.\n" +
                    "\n" +
                    "jmp exit\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "do_minus:\n" +
                    "\n" +
                    "mov ax, num1\n" +
                    "sub ax, num2\n" +
                    "call print_num    ; print ax value.\n" +
                    "\n" +
                    "jmp exit\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "do_mult:\n" +
                    "\n" +
                    "mov ax, num1\n" +
                    "imul num2 ; (dx ax) = ax * num2. \n" +
                    "call print_num    ; print ax value.\n" +
                    "; dx is ignored (calc works with tiny numbers only).\n" +
                    "\n" +
                    "jmp exit\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "do_div:\n" +
                    "; dx is ignored (calc works with tiny integer numbers only).\n" +
                    "mov dx, 0\n" +
                    "mov ax, num1\n" +
                    "idiv num2  ; ax = (dx ax) / num2.\n" +
                    "cmp dx, 0\n" +
                    "jnz approx\n" +
                    "call print_num    ; print ax value.\n" +
                    "jmp exit\n" +
                    "approx:\n" +
                    "call print_num    ; print ax value.\n" +
                    "lea dx, smth\n" +
                    "mov ah, 09h    ; output string at ds:dx\n" +
                    "int 21h  \n" +
                    "jmp exit\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    ";;; these functions are copied from emu8086.inc ;;;\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "\n" +
                    "\n" +
                    "; gets the multi-digit SIGNED number from the keyboard,\n" +
                    "; and stores the result in CX register:\n" +
                    "SCAN_NUM        PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    SI\n" +
                    "        \n" +
                    "        MOV     CX, 0\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        MOV     CS:make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "        ; get char from keyboard\n" +
                    "        ; into AL:\n" +
                    "        MOV     AH, 00h\n" +
                    "        INT     16h\n" +
                    "        ; and print it:\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "        ; check for MINUS:\n" +
                    "        CMP     AL, '-'\n" +
                    "        JE      set_minus\n" +
                    "\n" +
                    "        ; check for ENTER key:\n" +
                    "        CMP     AL, 0Dh  ; carriage return?\n" +
                    "        JNE     not_cr\n" +
                    "        JMP     stop_input\n" +
                    "not_cr:\n" +
                    "\n" +
                    "\n" +
                    "        CMP     AL, 8                   ; 'BACKSPACE' pressed?\n" +
                    "        JNE     backspace_checked\n" +
                    "        MOV     DX, 0                   ; remove last digit by\n" +
                    "        MOV     AX, CX                  ; division:\n" +
                    "        DIV     CS:ten                  ; AX = DX:AX / 10 (DX-rem).\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    ' '                     ; clear position.\n" +
                    "        PUTC    8                       ; backspace again.\n" +
                    "        JMP     next_digit\n" +
                    "backspace_checked:\n" +
                    "\n" +
                    "\n" +
                    "        ; allow only digits:\n" +
                    "        CMP     AL, '0'\n" +
                    "        JAE     ok_AE_0\n" +
                    "        JMP     remove_not_digit\n" +
                    "ok_AE_0:        \n" +
                    "        CMP     AL, '9'\n" +
                    "        JBE     ok_digit\n" +
                    "remove_not_digit:       \n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered not digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for next input.       \n" +
                    "ok_digit:\n" +
                    "\n" +
                    "\n" +
                    "        ; multiply CX by 10 (first time the result is zero)\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AX, CX\n" +
                    "        MUL     CS:ten                  ; DX:AX = AX*10\n" +
                    "        MOV     CX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        ; check if the number is too big\n" +
                    "        ; (result should be 16 bits)\n" +
                    "        CMP     DX, 0\n" +
                    "        JNE     too_big\n" +
                    "\n" +
                    "        ; convert from ASCII code:\n" +
                    "        SUB     AL, 30h\n" +
                    "\n" +
                    "        ; add AL to CX:\n" +
                    "        MOV     AH, 0\n" +
                    "        MOV     DX, CX      ; backup, in case the result will be too big.\n" +
                    "        ADD     CX, AX\n" +
                    "        JC      too_big2    ; jump if the number is too big.\n" +
                    "\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "set_minus:\n" +
                    "        MOV     CS:make_minus, 1\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "too_big2:\n" +
                    "        MOV     CX, DX      ; restore the backuped value before add.\n" +
                    "        MOV     DX, 0       ; DX was zero before backup!\n" +
                    "too_big:\n" +
                    "        MOV     AX, CX\n" +
                    "        DIV     CS:ten  ; reverse last DX:AX = AX*10, make AX = DX:AX / 10\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for Enter/Backspace.\n" +
                    "        \n" +
                    "        \n" +
                    "stop_input:\n" +
                    "        ; check flag:\n" +
                    "        CMP     CS:make_minus, 0\n" +
                    "        JE      not_minus\n" +
                    "        NEG     CX\n" +
                    "not_minus:\n" +
                    "\n" +
                    "        POP     SI\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "make_minus      DB      ?       ; used as a flag.\n" +
                    "SCAN_NUM        ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints number in AX,\n" +
                    "; used with PRINT_NUM_UNS to print signed numbers:\n" +
                    "PRINT_NUM       PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "\n" +
                    "        CMP     AX, 0\n" +
                    "        JNZ     not_zero\n" +
                    "\n" +
                    "        PUTC    '0'\n" +
                    "        JMP     printed\n" +
                    "\n" +
                    "not_zero:\n" +
                    "        ; the check SIGN of AX,\n" +
                    "        ; make absolute if it's negative:\n" +
                    "        CMP     AX, 0\n" +
                    "        JNS     positive\n" +
                    "        NEG     AX\n" +
                    "\n" +
                    "        PUTC    '-'\n" +
                    "\n" +
                    "positive:\n" +
                    "        CALL    PRINT_NUM_UNS\n" +
                    "printed:\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "PRINT_NUM       ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints out an unsigned\n" +
                    "; number in AX (not just a single digit)\n" +
                    "; allowed values are from 0 to 65535 (FFFF)\n" +
                    "PRINT_NUM_UNS   PROC    NEAR\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    BX\n" +
                    "        PUSH    CX\n" +
                    "        PUSH    DX\n" +
                    "\n" +
                    "        ; flag to prevent printing zeros before number:\n" +
                    "        MOV     CX, 1\n" +
                    "\n" +
                    "        ; (result of \"/ 10000\" is always less or equal to 9).\n" +
                    "        MOV     BX, 10000       ; 2710h - divider.\n" +
                    "\n" +
                    "        ; AX is zero?\n" +
                    "        CMP     AX, 0\n" +
                    "        JZ      print_zero\n" +
                    "\n" +
                    "begin_print:\n" +
                    "\n" +
                    "        ; check divider (if zero go to end_print):\n" +
                    "        CMP     BX,0\n" +
                    "        JZ      end_print\n" +
                    "\n" +
                    "        ; avoid printing zeros before number:\n" +
                    "        CMP     CX, 0\n" +
                    "        JE      calc\n" +
                    "        ; if AX<BX then result of DIV will be zero:\n" +
                    "        CMP     AX, BX\n" +
                    "        JB      skip\n" +
                    "calc:\n" +
                    "        MOV     CX, 0   ; set flag.\n" +
                    "\n" +
                    "        MOV     DX, 0\n" +
                    "        DIV     BX      ; AX = DX:AX / BX   (DX=remainder).\n" +
                    "\n" +
                    "        ; print last digit\n" +
                    "        ; AH is always ZERO, so it's ignored\n" +
                    "        ADD     AL, 30h    ; convert to ASCII code.\n" +
                    "        PUTC    AL\n" +
                    "\n" +
                    "\n" +
                    "        MOV     AX, DX  ; get remainder from last div.\n" +
                    "\n" +
                    "skip:\n" +
                    "        ; calculate BX=BX/10\n" +
                    "        PUSH    AX\n" +
                    "        MOV     DX, 0\n" +
                    "        MOV     AX, BX\n" +
                    "        DIV     CS:ten  ; AX = DX:AX / 10   (DX=remainder).\n" +
                    "        MOV     BX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        JMP     begin_print\n" +
                    "        \n" +
                    "print_zero:\n" +
                    "        PUTC    '0'\n" +
                    "        \n" +
                    "end_print:\n" +
                    "\n" +
                    "        POP     DX\n" +
                    "        POP     CX\n" +
                    "        POP     BX\n" +
                    "        POP     AX\n" +
                    "        RET\n" +
                    "PRINT_NUM_UNS   ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ten             DW      10      ; used as multiplier/divider by SCAN_NUM & PRINT_NUM_UNS.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "GET_STRING      PROC    NEAR\n" +
                    "PUSH    AX\n" +
                    "PUSH    CX\n" +
                    "PUSH    DI\n" +
                    "PUSH    DX\n" +
                    "\n" +
                    "MOV     CX, 0                   ; char counter.\n" +
                    "\n" +
                    "CMP     DX, 1                   ; buffer too small?\n" +
                    "JBE     empty_buffer            ;\n" +
                    "\n" +
                    "DEC     DX                      ; reserve space for last zero.\n" +
                    "\n" +
                    "\n" +
                    ";============================\n" +
                    "; Eternal loop to get\n" +
                    "; and processes key presses:\n" +
                    "\n" +
                    "wait_for_key:\n" +
                    "\n" +
                    "MOV     AH, 0                   ; get pressed key.\n" +
                    "INT     16h\n" +
                    "\n" +
                    "CMP     AL, 0Dh                  ; 'RETURN' pressed?\n" +
                    "JZ      exit_GET_STRING\n" +
                    "\n" +
                    "\n" +
                    "CMP     AL, 8                   ; 'BACKSPACE' pressed?\n" +
                    "JNE     add_to_buffer\n" +
                    "JCXZ    wait_for_key            ; nothing to remove!\n" +
                    "DEC     CX\n" +
                    "DEC     DI\n" +
                    "PUTC    8                       ; backspace.\n" +
                    "PUTC    ' '                     ; clear position.\n" +
                    "PUTC    8                       ; backspace again.\n" +
                    "JMP     wait_for_key\n" +
                    "\n" +
                    "add_to_buffer:\n" +
                    "\n" +
                    "        CMP     CX, DX          ; buffer is full?\n" +
                    "        JAE     wait_for_key    ; if so wait for 'BACKSPACE' or 'RETURN'...\n" +
                    "\n" +
                    "        MOV     [DI], AL\n" +
                    "        INC     DI\n" +
                    "        INC     CX\n" +
                    "        \n" +
                    "        ; print the key:\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "JMP     wait_for_key\n" +
                    ";============================\n" +
                    "\n" +
                    "exit_GET_STRING:\n" +
                    "\n" +
                    "; terminate by null:\n" +
                    "MOV     [DI], 0\n" +
                    "\n" +
                    "empty_buffer:\n" +
                    "\n" +
                    "POP     DX\n" +
                    "POP     DI\n" +
                    "POP     CX\n" +
                    "POP     AX\n" +
                    "RET\n" +
                    "GET_STRING      ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n",





            "\n" +
                    "\n" +
                    "; how to use cmpsb instruction to compare byte strings.\n" +
                    "name \"cmpsb\"\n" +
                    "\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; set forward direction:\n" +
                    "        cld     \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; load source into ds:si,\n" +
                    "; load target into es:di:\n" +
                    "        mov     ax, cs\n" +
                    "        mov     ds, ax\n" +
                    "        mov     es, ax\n" +
                    "        lea     si, str1\n" +
                    "        lea     di, str2\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; set counter to string length:\n" +
                    "mov     cx, size\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; compare until equal:\n" +
                    "repe    cmpsb\n" +
                    "jnz     not_equal\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; \"yes\" - equal!\n" +
                    "mov     al, 'y'\n" +
                    "mov     ah, 0eh\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jmp     exit_here\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "not_equal:\n" +
                    "\n" +
                    "; \"no\" - not equal!\n" +
                    "mov     al, 'n'\n" +
                    "mov     ah, 0eh\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "exit_here:\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; strings must have equal lengths:\n" +
                    "x1:\n" +
                    "str1 db 'test string'\n" +
                    "str2 db 'test string'\n" +
                    "size = ($ - x1) / 2\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",





            "\n" +
                    "; how to use cmpsw instruction to compare word strings.\n" +
                    "\n" +
                    "name \"cmpsw\"\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; set forward direction:\n" +
                    " cld     \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    "; load source into ds:si,\n" +
                    "; load target into es:di:\n" +
                    "        mov     ax, cs\n" +
                    "        mov     ds, ax\n" +
                    "        mov     es, ax\n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    "        lea     si, dat1\n" +
                    "        lea     di, dat2\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; set counter to data length in words:\n" +
                    "        mov     cx, size\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; compare until equal:\n" +
                    "        repe    cmpsw\n" +
                    "        jnz     not_equal\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; \"yes\" - equal!\n" +
                    "mov     al, 'y'\n" +
                    "mov     ah, 0eh\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jmp     exit_here\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "not_equal:\n" +
                    "\n" +
                    ";\"no\" - not equal!\n" +
                    "mov     al, 'n'\n" +
                    "mov     ah, 0eh\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "exit_here:\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; data vectors must have equal lengths:\n" +
                    "x1:\n" +
                    "dat1 dw 1234h, 5678h, 9012h, 3456h\n" +
                    "dat2 dw 1234h, 5678h, 9012h, 3456h\n" +
                    "size = ($ - x1) / 4\n" +
                    "\n" +
                    "\n",

            "; this sample prints 16x16 color map,\n" +
                    "; it uses all possible colors.\n" +
                    "\n" +
                    "name \"colors\"\n" +
                    "\n" +
                    "org     100h   \n" +
                    "\n" +
                    "\n" +
                    "; set video mode:\n" +
                    "; text mode. 80x25. 16 colors. 8 pages.\n" +
                    "mov     ax, 3\n" +
                    "int     10h\n" +
                    "\n" +
                    "; blinking disabled for compatibility with dos,\n" +
                    "; emulator and windows prompt do not blink anyway.\n" +
                    "mov     ax, 1003h\n" +
                    "mov     bx, 0      ; disable blinking.\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "               \n" +
                    "mov     dl, 0   ; current column.\n" +
                    "mov     dh, 0   ; current row.\n" +
                    "\n" +
                    "mov     bl, 0   ; current attributes.\n" +
                    "\n" +
                    "jmp     next_char\n" +
                    "\n" +
                    "next_row:\n" +
                    "inc     dh\n" +
                    "cmp     dh, 16\n" +
                    "je      stop_print\n" +
                    "mov     dl, 0\n" +
                    "\n" +
                    "next_char:\n" +
                    "\n" +
                    "; set cursor position at (dl,dh):\n" +
                    "mov     ah, 02h\n" +
                    "int     10h\n" +
                    "\n" +
                    "mov     al, 'a'\n" +
                    "mov     bh, 0\n" +
                    "mov     cx, 1\n" +
                    "mov     ah, 09h\n" +
                    "int     10h\n" +
                    "\n" +
                    "inc     bl      ; next attributes.\n" +
                    "\n" +
                    "inc     dl\n" +
                    "cmp     dl, 16\n" +
                    "je      next_row\n" +
                    "jmp     next_char\n" +
                    "\n" +
                    "stop_print:\n" +
                    "\n" +
                    "; set cursor position at (dl,dh):\n" +
                    "mov     dl, 10  ; column.\n" +
                    "mov     dh, 5   ; row.\n" +
                    "mov     ah, 02h\n" +
                    "int     10h\n" +
                    "\n" +
                    "; test of teletype output,\n" +
                    "; it uses color attributes\n" +
                    "; at current cursor position:\n" +
                    "mov     al, 'x'\n" +
                    "mov     ah, 0eh\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret\n",

            "name \"str2bin\"\n" +
                    "\n" +
                    "; convert string number to binary!\n" +
                    "\n" +
                    "; this program written in 8086 assembly language to\n" +
                    "; convert string value to binary form.\n" +
                    "\n" +
                    "; this example is copied with major modifications\n" +
                    "; from macro \"scan_num\" taken from  c:\\emu8086\\inc\\emu8086.inc\n" +
                    ";\n" +
                    "; the original \"scan_num\" not only converts the string number\n" +
                    "; but also reads the string from the keyboard and supports\n" +
                    "; backspace key, this example is a shorten version\n" +
                    "; of original \"scan_num\" macro.\n" +
                    "\n" +
                    "; here we assume that the string number is already given,\n" +
                    "; and the string number does not contain non-digit chars\n" +
                    "; and it cannot cause buffer overflow (number is in word range\n" +
                    "; and/or has only 4 digits).\n" +
                    "\n" +
                    "; negative values are allowed in this example.\n" +
                    "\n" +
                    "; the original \"scan_num\" does not allow to enter non-digits\n" +
                    "; and it also checks for buffer overflow.\n" +
                    "\n" +
                    "; you can the original file with other macro definitions\n" +
                    ";  in c:\\emu8086\\inc\\emu8086.inc\n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "; text data:\n" +
                    "msg1 db 0Dh,0Ah, \" enter any number from -32768 to 65535 inclusive, or zero to stop: $\"\n" +
                    "msg2 db 0Dh,0Ah, \" binary form: $\"\n" +
                    "\n" +
                    "; buffer for int 21h/0ah\n" +
                    "; fist byte is buffer size,\n" +
                    "; second byte is number of chars actually read (set by int 21h/0ah).\n" +
                    "buffer db 7,?, 5 dup (0), 0, 0\n" +
                    "\n" +
                    "; for result:\n" +
                    "binary dw ?\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; print welcome message:\n" +
                    "mov dx, offset msg1\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "; input string:\n" +
                    "mov dx, offset buffer\n" +
                    "mov ah, 0ah\n" +
                    "int 21h\n" +
                    "\n" +
                    "; make sure the string is zero terminated:\n" +
                    "mov bx, 0\n" +
                    "mov bl, buffer[1]\n" +
                    "mov buffer[bx+2], 0\n" +
                    "\n" +
                    "\n" +
                    "lea    si, buffer + 2  ; buffer starts from third byte.\n" +
                    "call    tobin\n" +
                    "\n" +
                    "; the number is in cx register.\n" +
                    "; for '-1234' it's 0fb2eh\n" +
                    "\n" +
                    "mov binary, cx\n" +
                    "\n" +
                    "jcxz stop\n" +
                    "\n" +
                    "; print pre-result message:\n" +
                    "mov dx, offset msg2\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov bx, binary\n" +
                    "mov cx, 16\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bx, 1000000000000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bx, 1\n" +
                    "loop print\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "\n" +
                    "jmp start  ; loop\n" +
                    "\n" +
                    "stop:\n" +
                    "\n" +
                    "ret ; return control to the operating system.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure converts string number to\n" +
                    "; binary number. number can have a sign ('-').\n" +
                    "; the result is stored in cx register.\n" +
                    "; parameters:\n" +
                    "; si - address of string number (zero terminated).\n" +
                    "\n" +
                    "tobin   proc    near\n" +
                    "        push    dx\n" +
                    "        push    ax\n" +
                    "        push    si\n" +
                    "   \n" +
                    "   \n" +
                    "jmp process\n" +
                    "       \n" +
                    ";==== local variables ====      \n" +
                    "make_minus      db      ?       ; used as a flag.\n" +
                    "ten             dw      10      ; used as multiplier.\n" +
                    ";=========================\n" +
                    "\n" +
                    "process:       \n" +
                    "\n" +
                    "        ; reset the accumulator:\n" +
                    "        mov     cx, 0\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        mov     cs:make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "    ; read char to al and\n" +
                    "    ; point to next byte:\n" +
                    "    mov     al, [si]\n" +
                    "    inc    si     \n" +
                    "\n" +
                    "        ; check for end of string:\n" +
                    "        cmp     al, 0  ; end of string?\n" +
                    "        jne     not_end\n" +
                    "        jmp     stop_input       \n" +
                    "not_end:\n" +
                    "\n" +
                    "        ; check for minus:\n" +
                    "        cmp     al, '-'\n" +
                    "        jne     ok_digit\n" +
                    "        mov     cs:make_minus, 1 ; set flag!\n" +
                    "    jmp     next_digit\n" +
                    "   \n" +
                    "ok_digit:\n" +
                    "\n" +
                    "        ; multiply cx by 10 (first time the result is zero)\n" +
                    "        push    ax\n" +
                    "        mov     ax, cx\n" +
                    "        mul     cs:ten                  ; dx:ax = ax*10\n" +
                    "        mov     cx, ax\n" +
                    "        pop     ax\n" +
                    "\n" +
                    "    ; it is assumed that dx is zero - overflow not checked!\n" +
                    "\n" +
                    "        ; convert from ascii code:\n" +
                    "        sub     al, 30h\n" +
                    "\n" +
                    "        ; add al to cx:\n" +
                    "        mov     ah, 0\n" +
                    "        mov     dx, cx      ; backup, in case the result will be too big.\n" +
                    "        add     cx, ax\n" +
                    "       \n" +
                    "        ; add - overflow not checked!\n" +
                    "\n" +
                    "        jmp     next_digit\n" +
                    "\n" +
                    "stop_input:\n" +
                    "\n" +
                    "        ; check flag, if string number had '-'\n" +
                    "        ; make sure the result is negative:\n" +
                    "        cmp     cs:make_minus, 0\n" +
                    "        je      not_minus\n" +
                    "        neg     cx\n" +
                    "       \n" +
                    "not_minus:\n" +
                    "\n" +
                    "        pop     si\n" +
                    "        pop     ax\n" +
                    "        pop     dx\n" +
                    "        ret\n" +
                    "tobin        endp\n" +
                    "\n",


            "name \"convert\"\n" +
                    "\n" +
                    "; this program uses a subroutine written in 8086 assembly language \n" +
                    "; that can be used for converting a string of number \n" +
                    "; (max of 4 ascii digit) to equivalent packed bcd digits.\n" +
                    "; bcd is binary coded decimal.\n" +
                    "\n" +
                    "; this program does no screen output.\n" +
                    "; to see results click \"vars\".\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "string db '1234'  ; 4 ascii digits.\n" +
                    "packed_bcd dw ?   ; two bytes (word) to store 4 digits.\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "lea bx, string\n" +
                    "lea di, packed_bcd\n" +
                    "call pack_to_bcd_and_binary\n" +
                    "\n" +
                    "ret ; return to operating system.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; subroutine written in 8086 assembly language \n" +
                    "; that can be used for converting a string of number \n" +
                    "; (max of 4 ascii digit) to equivalent packed\n" +
                    "; bcd digits. \n" +
                    "; input parameters:\n" +
                    ";    bx - address of source string (4 ascii digits).\n" +
                    "; output:\n" +
                    ";    di - must be set to address for packed bcd (2 bytes).\n" +
                    "\n" +
                    "\n" +
                    "pack_to_bcd_and_binary proc near\n" +
                    "pusha \n" +
                    "\n" +
                    "; point to 2 upper digits of packed bcd:\n" +
                    "; (assumed that we have 4 digits)\n" +
                    "add di, 1\n" +
                    "\n" +
                    "; loop only for 2 because every time we\n" +
                    "; read 2 digits (2 x 2 = 4 digits)\n" +
                    "mov cx, 2\n" +
                    "\n" +
                    "; reset packed bcd:\n" +
                    "mov word ptr [di], 0\n" +
                    "\n" +
                    "\t; to convert a char (0..9) to digit we need\n" +
                    "\t; to subtract 48 (30h) from its ascii code,\n" +
                    "\t; or just clear the upper nibble of a byte.\n" +
                    "\t; mask:  00001111b  (0fh)\n" +
                    "\t\n" +
                    "next_digit:\t\n" +
                    "mov ax, [bx]\t; read 2 digits.\n" +
                    "\n" +
                    "and ah, 00001111b\n" +
                    "and al, 00001111b\n" +
                    "\n" +
                    "; 8086 and all other Intel's microprocessors store less \n" +
                    "; significant byte at lower address.\n" +
                    " \n" +
                    "xchg al, ah\t\t\n" +
                    "\n" +
                    "; move first digit to upper nibble:\n" +
                    "shl ah, 4 \n" +
                    "\n" +
                    "; pack bcd:\n" +
                    "or ah, al \n" +
                    "\n" +
                    "; store 2 digits:\n" +
                    "mov [di], ah\n" +
                    "\n" +
                    "; next packed bcd:\n" +
                    "sub di, 1\n" +
                    "; next word (2 digits):\n" +
                    "add bx, 2\n" +
                    "\n" +
                    "loop next_digit\n" +
                    "\n" +
                    "popa\n" +
                    "ret\n" +
                    "pack_to_bcd_and_binary endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",


            "\n" +
                    "; this is a program in 8086 assembly language that\n" +
                    "; accepts a character string from the keyboard and\n" +
                    "; stores it in the string array. the program then converts \n" +
                    "; all the lower case characters of the string to upper case. \n" +
                    "; if the string is empty (null), it doesn't do anything.\n" +
                    "\n" +
                    "name \"upper\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "\n" +
                    "; first byte is buffer size,\n" +
                    "; second byte will hold number\n" +
                    "; of used bytes for string,\n" +
                    "; all other bytes are for characters:\n" +
                    "string db 20, 22 dup('?')\n" +
                    "\n" +
                    "new_line db 0Dh,0Ah, '$'  ; new line code.\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; int 21h / ah=0ah - input of a string to ds:dx, \n" +
                    "; fist byte is buffer size, second byte is number \n" +
                    "; of chars actually read. does not add '$' in the\n" +
                    "; end of string. to print using int 21h / ah=09h\n" +
                    "; you must set dollar sign at the end of it and \n" +
                    "; start printing from address ds:dx + 2.\n" +
                    "\n" +
                    "lea dx, string\n" +
                    "\n" +
                    "mov ah, 0ah\n" +
                    "int 21h\n" +
                    "\n" +
                    "mov bx, dx\n" +
                    "mov ah, 0\n" +
                    "mov al, ds:[bx+1]\n" +
                    "add bx, ax ; point to end of string.\n" +
                    "\n" +
                    "mov byte ptr [bx+2], '$' ; put dollar to the end.\n" +
                    "\n" +
                    "; int 21h / ah=09h - output of a string at ds:dx.\n" +
                    "; string must be terminated by '$' sign.\n" +
                    "lea dx, new_line\n" +
                    "mov ah, 09h\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "lea bx, string\n" +
                    "\n" +
                    "mov ch, 0\n" +
                    "mov cl, [bx+1] ; get string size.\n" +
                    "\n" +
                    "jcxz null ; is string is empty?\n" +
                    "\n" +
                    "add bx, 2 ; skip control chars.\n" +
                    "\n" +
                    "upper_case:\n" +
                    "\n" +
                    "; check if it's a lower case letter:\n" +
                    "cmp byte ptr [bx], 'a'\n" +
                    "jb ok\n" +
                    "cmp byte ptr [bx], 'z'\n" +
                    "ja ok\n" +
                    "\n" +
                    "; convert to uppercase:\n" +
                    "\n" +
                    "; upper case letter do not have\n" +
                    "; third bit set, for example:\n" +
                    "; 'a'             : 01100001b\n" +
                    "; 'a'             : 01000001b\n" +
                    "; upper case mask : 11011111b\n" +
                    "\n" +
                    "; clear third bit:\n" +
                    "and byte ptr [bx], 11011111b\n" +
                    "\n" +
                    "ok:\n" +
                    "inc bx ; next char.\n" +
                    "loop upper_case\n" +
                    "\n" +
                    "\n" +
                    "; int 21h / ah=09h - output of a string at ds:dx.\n" +
                    "; string must be terminated by '$' sign.\n" +
                    "lea dx, string+2\n" +
                    "mov ah, 09h\n" +
                    "int 21h\n" +
                    " \n" +
                    "; wait for any key press....\n" +
                    "mov ah, 0\n" +
                    "int 16h \n" +
                    " \n" +
                    " \n" +
                    "null:\n" +
                    "ret  ; return to operating system.\n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " ",


            "\n" +
                    "; counts the number of characters of a zero terminated string.\n" +
                    "\n" +
                    "name \"counter\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "str1 db 'abcdefg hijklmnop qrstvuwxyz', 0\n" +
                    "\n" +
                    "start: lea bx, str1 ; load address of string.\n" +
                    "       mov ax, 0 ; reset counter.\n" +
                    "\n" +
                    "compare: cmp [bx], 0 ; is it end of string?\n" +
                    "         je done  ; if zero, then it's the end.\n" +
                    "         inc ax   ; count char.\n" +
                    "         inc bx   ; next memory position in string.\n" +
                    "         jmp compare\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "done:\n" +
                    "mov bx, ax\n" +
                    "mov cx, 8\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bl, 10000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bl, 1\n" +
                    "loop print\n" +
                    "\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press....\n" +
                    "mov ah, 0\n" +
                    "int 16h \n" +
                    "\n" +
                    "\n" +
                    "ret\n",


            "; Count number of key presses. the result is in bx register.\n" +
                    ";\n" +
                    "; You must type into the emulator's screen,\n" +
                    "; if it closes, press screen button to re-open it.\n" +
                    "\n" +
                    "name \"keycount\"\n" +
                    "\n" +
                    "org  100h \n" +
                    "\n" +
                    "; print welcome message:\n" +
                    "mov dx, offset msg\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "xor bx, bx ; zero bx register.   \n" +
                    "\n" +
                    "wait:  mov ah, 0   ; wait for any key....\n" +
                    "       int 16h\n" +
                    "\n" +
                    "       cmp al, 27  ; if key is 'esc' then exit.\n" +
                    "       je stop\n" +
                    "\n" +
                    "       mov ah, 0eh ; print it.\n" +
                    "       int 10h\n" +
                    "\n" +
                    "       inc bx ; increase bx on every key press.\n" +
                    "\n" +
                    "       jmp wait\n" +
                    "\n" +
                    "\n" +
                    "; print result message:\n" +
                    "stop:  mov dx, offset msg2\n" +
                    "       mov ah, 9\n" +
                    "       int 21h\n" +
                    "\n" +
                    "mov ax, bx\n" +
                    "call print_ax\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret ; exit to operating system.\n" +
                    "\n" +
                    "msg db \"I'll count all your keypresses. press 'Esc' to stop...\", 0Dh,0Ah, \"$\"\n" +
                    "msg2 db 0Dh,0Ah, \"recorded keypresses: $\" \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "   \n" +
                    "print_ax proc\n" +
                    "cmp ax, 0\n" +
                    "jne print_ax_r\n" +
                    "    push ax\n" +
                    "    mov al, '0'\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h\n" +
                    "    pop ax\n" +
                    "    ret \n" +
                    "print_ax_r:\n" +
                    "    pusha\n" +
                    "    mov dx, 0\n" +
                    "    cmp ax, 0\n" +
                    "    je pn_done\n" +
                    "    mov bx, 10\n" +
                    "    div bx    \n" +
                    "    call print_ax_r\n" +
                    "    mov ax, dx\n" +
                    "    add al, 30h\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h    \n" +
                    "    jmp pn_done\n" +
                    "pn_done:\n" +
                    "    popa  \n" +
                    "    ret  \n" +
                    "endp\n" +
                    "\n",


            "\n" +
                    "; interrupt vector (memory from 00000h to 00400h)\n" +
                    "; keeps addresses of all interrupts (from 00h to 0ffh).\n" +
                    "; you can add new interrupt or modify existing interrupts.\n" +
                    "; address of interrupt M is stored in vector at offset M * 4,\n" +
                    "; for example: interrupt 10h is stored at offset 10h * 4.\n" +
                    "; first goes the offset, then segment (total of 2 bytes).\n" +
                    "\n" +
                    "; for more information refer to \"global memory table\" in c:\\emu8086\\documentation.\n" +
                    " \n" +
                    "; note: this is simplified example, it is not recommended to make changes to it\n" +
                    "; and run it on the real computer, especially it is not recommended to replace disk\n" +
                    "; processing interrupts because this may cause data loss and other instability problems.\n" +
                    "\n" +
                    " \n" +
                    "name \"custint\"\n" +
                    "\n" +
                    " \n" +
                    "org 100h\n" +
                    "\n" +
                    "start:\n" +
                    " \n" +
                    "; set video mode to 3 - 16 color 80x25\n" +
                    "mov ah, 0\n" +
                    "mov al, 3\n" +
                    "int 10h\n" +
                    " \n" +
                    " \n" +
                    "; set es to \"0000\":\n" +
                    "mov ax, 0       \n" +
                    "mov es, ax\n" +
                    "; calculate vector address for interrupt 90h:\n" +
                    "mov al, 90h    \n" +
                    "; multiply 90h by 4, store result in ax:\n" +
                    "mov bl, 4h       \n" +
                    "mul bl          \n" +
                    "mov bx, ax\n" +
                    "; copy offset into interrupt vector:\n" +
                    "mov si, offset [test1]\n" +
                    "mov es:[bx], si\n" +
                    "add bx, 2   \n" +
                    "; copy segment into interrupt vector:    \n" +
                    "mov ax, cs     \n" +
                    "mov es:[bx], ax\n" +
                    "         \n" +
                    "\n" +
                    "int 90h    ; test newly created interrupt.\n" +
                    " \n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    " \n" +
                    " \n" +
                    "int 20h     ; halt execution.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; interrupt 90h starts here:\n" +
                    "test1: pusha  ; store all registers.\n" +
                    "\n" +
                    "; make sure data segment is code segment:\n" +
                    "       push cs\n" +
                    "       pop ds\n" +
                    "\n" +
                    "; set segment register to video memory:\n" +
                    "       mov     ax, 0b800h\n" +
                    "       mov     es, ax\n" +
                    "\n" +
                    "; print message, each character is written as\n" +
                    "; a word, high byte is color and low byte is\n" +
                    "; ascii code:\n" +
                    "      lea si, msg      ; load offset of msg to si.\n" +
                    "      mov di, 0        ; point to start of the screen.\n" +
                    "print:\n" +
                    "      cmp [si], 0      ; if \"0\" then stop.\n" +
                    "      je stop\n" +
                    "      mov bl,  [si]    ; read ascii code from msg.\n" +
                    "      mov bh, 0f1h     ; set colors: white background, blue text.\n" +
                    "      mov es:[di], bx  ; write to video memory.\n" +
                    "      add di, 2        ; go to next position on screen.\n" +
                    "      inc si           ; next char.\n" +
                    "      jmp print\n" +
                    "stop:\n" +
                    "      popa  ; re-store all registers.\n" +
                    "      iret  ; return from interrupt.\n" +
                    " \n" +
                    "msg db \"test of custom interrupt!\", 0\n" +
                    "\n" +
                    "\n",



            " ; Date and time functions\n" +
                    "; Get date and time and save \n" +
                    ";to file using Disk Operating\n" +
                    "; System interrupts.\n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    " \n" +
                    "; The program prints the date \n" +
                    ";and saves it to file when running\n" +
                    "; from emu8086 the path is:\n" +
                    "; c:\\emu8086\\vdrive\\c\\date.txt\n" +
                    "; when running from dos prompt the path is:\n" +
                    "; c:\\date.txt\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "name \"datefile\"\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org 100h  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "TAB EQU 9   ; ASCII CODE\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "mov ah, 2ah ; get date \n" +
                    "int 21h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "lea bx, week_table\n" +
                    "\n" +
                    "\n" +
                    "xlat\n" +
                    "\n" +
                    "\n" +
                    "mov w. week, al ; 0=sunday  \n" +
                    "\n" +
                    "\n" +
                    "add cx, 0f830h               ; for years \n" +
                    "\n" +
                    "\n" +
                    "mov ax, cx \n" +
                    "\n" +
                    "\n" +
                    "call deci \n" +
                    "\n" +
                    "\n" +
                    "mov w. year, ax \n" +
                    "\n" +
                    "\n" +
                    "mov al, dh; month \n" +
                    "\n" +
                    "\n" +
                    "call deci \n" +
                    "\n" +
                    "\n" +
                    "mov w. mont, ax \n" +
                    "\n" +
                    "\n" +
                    "mov al, dl ; day \n" +
                    "\n" +
                    "\n" +
                    "call deci \n" +
                    "\n" +
                    "\n" +
                    "mov w. day, ax \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; get time\n" +
                    "mov ah, 2ch                   \n" +
                    "int 21h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; hour\n" +
                    "mov al, ch                    \n" +
                    "\n" +
                    "\n" +
                    "call deci \n" +
                    "\n" +
                    "\n" +
                    "mov w. hour, ax \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; minute\n" +
                    "mov al, cl \n" +
                    "\n" +
                    "\n" +
                    "call deci \n" +
                    "\n" +
                    "\n" +
                    "mov w. minu, ax \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; second \n" +
                    "mov al, dh \n" +
                    "\n" +
                    "\n" +
                    "call deci \n" +
                    "\n" +
                    "\n" +
                    "mov w. seco, ax \n" +
                    "\n" +
                    "\n" +
                    "mov ah, TAB \n" +
                    "\n" +
                    "\n" +
                    "mov dx, offset txt \n" +
                    "int 21h          \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; file attribute\n" +
                    "mov cx, 0       \n" +
                    "\n" +
                    "          \n" +
                    "          \n" +
                    "; create new file\n" +
                    "mov ax, 3c00h \n" +
                    "mov dx, offset fildat \n" +
                    "int 21h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jb error  ; error\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "mov w. handle, ax\n" +
                    "\n" +
                    "mov ax, 4200h \n" +
                    "mov bx, w. handle \n" +
                    "xor cx, cx; begin byte 0 \n" +
                    "xor dx, dx                   ;  \n" +
                    "int 21h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jb error \n" +
                    "\n" +
                    "mov ah, 40h ; write to file \n" +
                    "mov bx, w. handle \n" +
                    "mov cx, offset seco - offset txt  ; 34 bytes \n" +
                    "mov dx, offset dat \n" +
                    "int 21h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jb error \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; close file.\n" +
                    "mov ah, 3eh \n" +
                    "mov bx, w. handle \n" +
                    "int 21h \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "error:        ; leave program (unconditionally). \n" +
                    "mov ax, 4c00h\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "deci:                        ; calculate in decimal \n" +
                    "push cx\n" +
                    "xor ah, ah \n" +
                    "mov cl, 10 \n" +
                    "div cl \n" +
                    "add ax, 3030h\n" +
                    "pop cx\n" +
                    "ret \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "fildat db \"c:\\date.txt\",0    ; where to save date and time.\n" +
                    "handle db 0,0 \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; here's data to display the date and time \n" +
                    "\n" +
                    "txt  db 0Dh, 0Ah, 0Ah, TAB, TAB          ; jump line and go two tabs right \n" +
                    "dat  db \"week day: \"\n" +
                    "week db 0, TAB                           ; put the day 1=monday   9 jump a colon (tab)\n" +
                    "     db \"20\"\n" +
                    "year db 0, 0, '-'        \n" +
                    "mont db 0, 0, '-' \n" +
                    "day  db 0, 0, TAB  \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "hour db 0, 0, ':'       \n" +
                    "minu db 0, 0, ':' \n" +
                    "seco db 0, 0, ' '\n" +
                    "      db 0Dh, 0Ah, 24h         ; line feed   return   and  stop symbol 24h=$ (ASCII). \n" +
                    "                    \n" +
                    "                    \n" +
                    "week_table db \"SMTWTFS\" ",



            "org 100h\n" +
                    "\n" +
                    "jmp a\n" +
                    "; double word definition is supported:  \n" +
                    "mydouble dd 12345678h\n" +
                    "\n" +
                    "; it is equal to:  \n" +
                    "mywords   dw 5678h\n" +
                    "          dw 1234h\n" +
                    "\n" +
                    ";  and it is equal to:  \n" +
                    "mybytes   db  78h\n" +
                    "          db  56h\n" +
                    "          db  34h\n" +
                    "          db  12h\n" +
                    "\n" +
                    "; exactly 32 bits  \n" +
                    "binn dd 00010010001101000101011001111000b\n" +
                    "; load double word to dx:ax  \n" +
                    "a: mov ax, binn\n" +
                    "   mov dx, [binn+2]\n" +
                    "\n" +
                    "ret\n",


            "; 8086 subroutine to encrypt/decrypt lower case characters using xlat\n" +
                    "\n" +
                    "name \"crypt\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "; string has '$' in the end:\n" +
                    "string1 db 'hello world!', 0Dh,0Ah, '$'\n" +
                    "\n" +
                    "\n" +
                    ";                       'abcdefghijklmnopqrstvuwxyz'\n" +
                    "\n" +
                    "table1 db 97 dup (' '), 'klmnxyzabcopqrstvuwdefghij'\n" +
                    "\n" +
                    "table2 db 97 dup (' '), 'hijtuvwxyzabcdklmnoprqsefg'\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; encrypt:\n" +
                    "lea bx, table1\n" +
                    "lea si, string1\n" +
                    "call parse\n" +
                    "\n" +
                    "; show result:\n" +
                    "lea dx, string1\n" +
                    "; output of a string at ds:dx\n" +
                    "mov ah, 09\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; decrypt:\n" +
                    "lea bx, table2\n" +
                    "lea si, string1\n" +
                    "call parse\n" +
                    "\n" +
                    "; show result:\n" +
                    "lea dx, string1\n" +
                    "; output of a string at ds:dx\n" +
                    "mov ah, 09\n" +
                    "int 21h\n" +
                    "\n" +
                    "; wait for any key...\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret   ; exit to operating system.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; subroutine to encrypt/decrypt\n" +
                    "; parameters: \n" +
                    ";             si - address of string to encrypt\n" +
                    ";             bx - table to use.\n" +
                    "parse proc near\n" +
                    "\n" +
                    "next_char:\n" +
                    "\tcmp [si], '$'      ; end of string?\n" +
                    "\tje end_of_string\n" +
                    "\t\n" +
                    "\tmov al, [si]\n" +
                    "\tcmp al, 'a'\n" +
                    "\tjb  skip\n" +
                    "\tcmp al, 'z'\n" +
                    "\tja  skip\t\n" +
                    "\t; xlat algorithm: al = ds:[bx + unsigned al] \n" +
                    "\txlatb     ; encrypt using table2.  \n" +
                    "\tmov [si], al\n" +
                    "skip:\n" +
                    "\tinc si\t\n" +
                    "\tjmp next_char\n" +
                    "\n" +
                    "end_of_string:\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "parse endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "end\n",



            "; a tiny example of multi segment executable file.\n" +
                    "; data is stored in a separate segment, segment registers must be set correctly.\n" +
                    "\n" +
                    "name \"testexe\"\n" +
                    "\n" +
                    "data segment\n" +
                    "    msg  db \"hello, world!\", 0dh,0ah, '$'\n" +
                    "ends\n" +
                    "\n" +
                    "stack segment\n" +
                    "    db 30 dup(0)\n" +
                    "ends\n" +
                    "\n" +
                    "code segment\n" +
                    "start:\n" +
                    " ; set segment registers:\n" +
                    "        mov     ax, data\n" +
                    "        mov     ds, ax\n" +
                    "        mov     es, ax\n" +
                    "\n" +
                    " ; print \"hello, world!\":\n" +
                    "        lea     dx, msg\n" +
                    "        mov     ah, 09h\n" +
                    "        int     21h\n" +
                    "\n" +
                    " ; wait for any key...\n" +
                    "        mov     ah, 0\n" +
                    "        int     16h\n" +
                    "\n" +
                    " ; return control to os:\n" +
                    "        mov     ah, 4ch\n" +
                    "        int     21h\n" +
                    "ends\n" +
                    "        end start  ; set entry point and stop the assembler.\n" +
                    "        \n" +
                    "        \n",




            "; this example gets the number from the user,\n" +
                    "; and calculates factorial for it.\n" +
                    "; supported input from 0 to 8 inclusive!\n" +
                    "\n" +
                    "name \"fact\"\n" +
                    "\n" +
                    "; this macro prints a char in AL and advances\n" +
                    "; the current cursor position:\n" +
                    "putc    macro   char\n" +
                    "        push    ax\n" +
                    "        mov     al, char\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h     \n" +
                    "        pop     ax\n" +
                    "endm\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "\n" +
                    "result dw ?\n" +
                    "     \n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; get first number:\n" +
                    "\n" +
                    "mov dx, offset msg1\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "jmp n1\n" +
                    "msg1 db 0Dh,0Ah, 'enter the number: $'\n" +
                    "n1:\n" +
                    "\n" +
                    "call    scan_num\n" +
                    "\n" +
                    "\n" +
                    "; factorial of 0 = 1:\n" +
                    "mov     ax, 1\n" +
                    "cmp     cx, 0\n" +
                    "je      print_result\n" +
                    "\n" +
                    "; move the number to bx:\n" +
                    "; cx will be a counter:\n" +
                    "\n" +
                    "mov     bx, cx\n" +
                    "\n" +
                    "mov     ax, 1\n" +
                    "mov     bx, 1\n" +
                    "\n" +
                    "calc_it:\n" +
                    "mul     bx\n" +
                    "cmp     dx, 0\n" +
                    "jne     overflow\n" +
                    "inc     bx\n" +
                    "loop    calc_it\n" +
                    "\n" +
                    "mov result, ax\n" +
                    "\n" +
                    "\n" +
                    "print_result:\n" +
                    "\n" +
                    "; print result in ax:\n" +
                    "mov dx, offset msg2\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "jmp n2\n" +
                    "msg2 db 0Dh,0Ah, 'factorial: $'\n" +
                    "n2:\n" +
                    "\n" +
                    "\n" +
                    "mov     ax, result\n" +
                    "call    print_num_uns\n" +
                    "jmp     exit\n" +
                    "\n" +
                    "\n" +
                    "overflow:\n" +
                    "mov dx, offset msg3\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "jmp n3\n" +
                    "msg3 db 0Dh,0Ah, 'the result is too big!', 0Dh,0Ah, 'use values from 0 to 8.$'\n" +
                    "n3:\n" +
                    "jmp     start\n" +
                    "\n" +
                    "exit:\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    ";;; these functions are copied from emu8086.inc ;;;\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "\n" +
                    "\n" +
                    "; gets the multi-digit SIGNED number from the keyboard,\n" +
                    "; and stores the result in CX register:\n" +
                    "SCAN_NUM        PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    SI\n" +
                    "        \n" +
                    "        MOV     CX, 0\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        MOV     CS:make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "        ; get char from keyboard\n" +
                    "        ; into AL:\n" +
                    "        MOV     AH, 00h\n" +
                    "        INT     16h\n" +
                    "        ; and print it:\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "        ; check for MINUS:\n" +
                    "        CMP     AL, '-'\n" +
                    "        JE      set_minus\n" +
                    "\n" +
                    "        ; check for ENTER key:\n" +
                    "        CMP     AL, 0Dh  ; carriage return?\n" +
                    "        JNE     not_cr\n" +
                    "        JMP     stop_input\n" +
                    "not_cr:\n" +
                    "\n" +
                    "\n" +
                    "        CMP     AL, 8                   ; 'BACKSPACE' pressed?\n" +
                    "        JNE     backspace_checked\n" +
                    "        MOV     DX, 0                   ; remove last digit by\n" +
                    "        MOV     AX, CX                  ; division:\n" +
                    "        DIV     CS:ten                  ; AX = DX:AX / 10 (DX-rem).\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    ' '                     ; clear position.\n" +
                    "        PUTC    8                       ; backspace again.\n" +
                    "        JMP     next_digit\n" +
                    "backspace_checked:\n" +
                    "\n" +
                    "\n" +
                    "        ; allow only digits:\n" +
                    "        CMP     AL, '0'\n" +
                    "        JAE     ok_AE_0\n" +
                    "        JMP     remove_not_digit\n" +
                    "ok_AE_0:        \n" +
                    "        CMP     AL, '9'\n" +
                    "        JBE     ok_digit\n" +
                    "remove_not_digit:       \n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered not digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for next input.       \n" +
                    "ok_digit:\n" +
                    "\n" +
                    "\n" +
                    "        ; multiply CX by 10 (first time the result is zero)\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AX, CX\n" +
                    "        MUL     CS:ten                  ; DX:AX = AX*10\n" +
                    "        MOV     CX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        ; check if the number is too big\n" +
                    "        ; (result should be 16 bits)\n" +
                    "        CMP     DX, 0\n" +
                    "        JNE     too_big\n" +
                    "\n" +
                    "        ; convert from ASCII code:\n" +
                    "        SUB     AL, 30h\n" +
                    "\n" +
                    "        ; add AL to CX:\n" +
                    "        MOV     AH, 0\n" +
                    "        MOV     DX, CX      ; backup, in case the result will be too big.\n" +
                    "        ADD     CX, AX\n" +
                    "        JC      too_big2    ; jump if the number is too big.\n" +
                    "\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "set_minus:\n" +
                    "        MOV     CS:make_minus, 1\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "too_big2:\n" +
                    "        MOV     CX, DX      ; restore the backuped value before add.\n" +
                    "        MOV     DX, 0       ; DX was zero before backup!\n" +
                    "too_big:\n" +
                    "        MOV     AX, CX\n" +
                    "        DIV     CS:ten  ; reverse last DX:AX = AX*10, make AX = DX:AX / 10\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for Enter/Backspace.\n" +
                    "        \n" +
                    "        \n" +
                    "stop_input:\n" +
                    "        ; check flag:\n" +
                    "        CMP     CS:make_minus, 0\n" +
                    "        JE      not_minus\n" +
                    "        NEG     CX\n" +
                    "not_minus:\n" +
                    "\n" +
                    "        POP     SI\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "make_minus      DB      ?       ; used as a flag.\n" +
                    "SCAN_NUM        ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints number in AX,\n" +
                    "; used with PRINT_NUM_UNS to print signed numbers:\n" +
                    "PRINT_NUM       PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "\n" +
                    "        CMP     AX, 0\n" +
                    "        JNZ     not_zero\n" +
                    "\n" +
                    "        PUTC    '0'\n" +
                    "        JMP     printed\n" +
                    "\n" +
                    "not_zero:\n" +
                    "        ; the check SIGN of AX,\n" +
                    "        ; make absolute if it's negative:\n" +
                    "        CMP     AX, 0\n" +
                    "        JNS     positive\n" +
                    "        NEG     AX\n" +
                    "\n" +
                    "        PUTC    '-'\n" +
                    "\n" +
                    "positive:\n" +
                    "        CALL    PRINT_NUM_UNS\n" +
                    "printed:\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "PRINT_NUM       ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints out an unsigned\n" +
                    "; number in AX (not just a single digit)\n" +
                    "; allowed values are from 0 to 65535 (FFFF)\n" +
                    "PRINT_NUM_UNS   PROC    NEAR\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    BX\n" +
                    "        PUSH    CX\n" +
                    "        PUSH    DX\n" +
                    "\n" +
                    "        ; flag to prevent printing zeros before number:\n" +
                    "        MOV     CX, 1\n" +
                    "\n" +
                    "        ; (result of \"/ 10000\" is always less or equal to 9).\n" +
                    "        MOV     BX, 10000       ; 2710h - divider.\n" +
                    "\n" +
                    "        ; AX is zero?\n" +
                    "        CMP     AX, 0\n" +
                    "        JZ      print_zero\n" +
                    "\n" +
                    "begin_print:\n" +
                    "\n" +
                    "        ; check divider (if zero go to end_print):\n" +
                    "        CMP     BX,0\n" +
                    "        JZ      end_print\n" +
                    "\n" +
                    "        ; avoid printing zeros before number:\n" +
                    "        CMP     CX, 0\n" +
                    "        JE      calc\n" +
                    "        ; if AX<BX then result of DIV will be zero:\n" +
                    "        CMP     AX, BX\n" +
                    "        JB      skip\n" +
                    "calc:\n" +
                    "        MOV     CX, 0   ; set flag.\n" +
                    "\n" +
                    "        MOV     DX, 0\n" +
                    "        DIV     BX      ; AX = DX:AX / BX   (DX=remainder).\n" +
                    "\n" +
                    "        ; print last digit\n" +
                    "        ; AH is always ZERO, so it's ignored\n" +
                    "        ADD     AL, 30h    ; convert to ASCII code.\n" +
                    "        PUTC    AL\n" +
                    "\n" +
                    "\n" +
                    "        MOV     AX, DX  ; get remainder from last div.\n" +
                    "\n" +
                    "skip:\n" +
                    "        ; calculate BX=BX/10\n" +
                    "        PUSH    AX\n" +
                    "        MOV     DX, 0\n" +
                    "        MOV     AX, BX\n" +
                    "        DIV     CS:ten  ; AX = DX:AX / 10   (DX=remainder).\n" +
                    "        MOV     BX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        JMP     begin_print\n" +
                    "        \n" +
                    "print_zero:\n" +
                    "        PUTC    '0'\n" +
                    "        \n" +
                    "end_print:\n" +
                    "\n" +
                    "        POP     DX\n" +
                    "        POP     CX\n" +
                    "        POP     BX\n" +
                    "        POP     AX\n" +
                    "        RET\n" +
                    "PRINT_NUM_UNS   ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ten             DW      10      ; used as multiplier/divider by SCAN_NUM & PRINT_NUM_UNS.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",





            "; centigrade (celsius) to fahrenheit calculation and vice-versa.\n" +
                    "; it may not be accurate, because of integer division.\n" +
                    "\n" +
                    "; this program prints out the result in binary code.\n" +
                    "; to see result in hexadecimal or decimal form click vars.\n" +
                    "\n" +
                    "name \"celsi\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "tc db 10    ; t celsius.\n" +
                    "tf db 0     ; t fahrenheit.\n" +
                    "\n" +
                    "result1 db ?   ; result in fahrenheit.\n" +
                    "result2 db ?   ; result in celsius.\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; convert celsius to fahrenheit according\n" +
                    "; to this formula: f = c * 9 / 5 + 32\n" +
                    "\n" +
                    "mov cl, tc\n" +
                    "mov al, 9\n" +
                    "imul cl\n" +
                    "mov cl, 5\n" +
                    "idiv cl\n" +
                    "add al, 32\n" +
                    "mov result1, al\n" +
                    "\n" +
                    "mov bl, result1\n" +
                    "call print  ; print bl\n" +
                    "\n" +
                    "\n" +
                    "; convert fahrenheit to celsius according\n" +
                    "; to this formula: c = (f - 32) * 5 / 9\n" +
                    "\n" +
                    "mov cl, tf\n" +
                    "sub cl, 32\n" +
                    "mov al, 5\n" +
                    "imul cl\n" +
                    "mov cl, 9\n" +
                    "idiv cl\n" +
                    "mov result2, al\n" +
                    "\n" +
                    "mov bl, result2\n" +
                    "call print  ; print bl\n" +
                    "\n" +
                    "; wait for any key press...\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret  ; return to the operating system.\n" +
                    "\n" +
                    "\n" +
                    "; procedure prints the binary value of bl\n" +
                    "print proc near\n" +
                    "\n" +
                    "pusha\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov cx, 8\n" +
                    "p1:    mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bl, 10000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bl, 1\n" +
                    "loop p1\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "; print carrige return and new line:\n" +
                    "mov dl, 0Dh\n" +
                    "int 21h\n" +
                    "mov dl, 0Ah\n" +
                    "int 21h\n" +
                    "\n" +
                    "popa\n" +
                    "\n" +
                    "ret  ; return to the main program.\n" +
                    "print endp\n" +
                    "\n" +
                    "\n",





            "name \"callfar\"\n" +
                    "\n" +
                    "; examples shows how to call int 10h without using int instruction.\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "; set es:bx to point to int 10h vector in interrupt vector table\n" +
                    "mov bx, 0h  \n" +
                    "mov es, bx\n" +
                    "mov bx, 40h\n" +
                    "mov ah, 0eh ; set up int 10h params\n" +
                    "mov al, '*' \n" +
                    "pushf\n" +
                    "call far es:[bx] ; do a far cal to int10h vector\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key....\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n",





            "name \"faradv\"\n" +
                    "\n" +
                    "org  100h\t; set location counter to 100h\n" +
                    "\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "adr_a dw  offset a\n" +
                    "seg_a dw  ?\n" +
                    "\n" +
                    "adr_c dw  offset c\n" +
                    "seg_c dw  ?\n" +
                    "\n" +
                    "; set segments, requred because we don't know where\n" +
                    "; the program will be loaded by the operating system\n" +
                    "start:\n" +
                    "mov ax, cs\n" +
                    "mov seg_a, ax\n" +
                    "mov seg_c, ax\n" +
                    "\n" +
                    "call far adr_a\n" +
                    "call b\n" +
                    "call far adr_c\n" +
                    "\n" +
                    "mov ax, offset d\n" +
                    "call ax           \n" +
                    "\n" +
                    "ret  ; return to os.\n" +
                    "\n" +
                    ";--------------------------------------------------\n" +
                    "a proc\n" +
                    "\tmov ax, 1\n" +
                    "\tretf      ; far return, pop ip and cs.\n" +
                    "a endp\n" +
                    ";--------------------------------------------------\n" +
                    "b proc\n" +
                    "\tadd ax, 2\n" +
                    "\tret       ; return, pop ip only.\n" +
                    "b endp\n" +
                    ";-------------------------------------------------\n" +
                    "c proc\n" +
                    "\tadd ax, 3\n" +
                    "\tretf      ; far return, pop ip and cs.\n" +
                    "c endp\n" +
                    ";-------------------------------------------------\n" +
                    "d proc\n" +
                    "\tadd ax, 4\n" +
                    "\tret       ; return, pop ip only.\n" +
                    "d endp\n" +
                    ";-------------------------------------------------\n" +
                    "\n" +
                    "\n" +
                    "; note: assembler automatically replaces ret (C3) with retf (CB)\n" +
                    ";       if proc has far label, for example:\n" +
                    ";       c proc far\n" +
                    ";          ....\n",




            "name \"far2\"\n" +
                    "\n" +
                    "; the correct use of far call for defined procedures.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org    100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "off_print_me dw ?\n" +
                    "seg_print_me dw ?\n" +
                    "\n" +
                    "start:\n" +
                    "mov off_print_me, printme\n" +
                    "mov seg_print_me, seg printme\n" +
                    "call far off_print_me\n" +
                    "db 'hello', 0\n" +
                    "\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";*******************************\n" +
                    "printme proc far\n" +
                    "mov     cs:origSI, si  ; protect SI register.\n" +
                    "mov     cs:origDS, ds  ; protect DS register.\n" +
                    "pop     si             ; get return address (IP).\n" +
                    "pop     ds             ; get return segment.\n" +
                    "push    ax             ; store ax register.\n" +
                    "next_char:\n" +
                    "       mov     al, ds:[si]\n" +
                    "       inc     si            ; next byte.\n" +
                    "       cmp     al, 0\n" +
                    "       jz      printed\n" +
                    "       mov     ah, 0eh       ; teletype function.\n" +
                    "       int     10h\n" +
                    "       jmp     next_char     ; loop.\n" +
                    "printed:\n" +
                    "pop     ax                   ; re-store ax register.\n" +
                    "push    ds                   ; ds:si should point to next command after the call instruction and string definition.\n" +
                    "mov     ds, cs:origDS        ; re-store ds register.\n" +
                    "push    si                   ; save new return address into the stack.\n" +
                    "mov     si, cs:origSI        ; re-store si register.\n" +
                    "retf\n" +
                    "; variables to store the original value of SI and DS registers:\n" +
                    "origSI  dw  ?\n" +
                    "origDS  dw ?\n" +
                    "endp\n" +
                    ";*******************************\n" +
                    "\n",







            "; Flat Assembler uses the Intel syntax.\n" +
                    "; Effective for:\n" +
                    ";      Flat assembler version 1.64\n" +
                    ";      emu8086 integrated assembler version 4.00-Beta-20 (or above)          \n" +
                    "           \n" +
                    "#fasm#   ; this code is for FASM.\n" +
                    "\n" +
                    "org 100h   \n" +
                    "\n" +
                    "name \"fasmcomp\"   \n" +
                    "   \n" +
                    " \n" +
                    "; === [NOTE 1] \n" +
                    "; calculate the sum of 'a' and 'b'\n" +
                    "  \n" +
                    "jmp start\n" +
                    "  \n" +
                    "a dw 5\n" +
                    "b dw 7\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; this is correct syntax for emu8086 integrated assembler,\n" +
                    "; but it is wrong for fasm:\n" +
                    "mov ax, a\n" +
                    "mov bx, b\n" +
                    "add ax, bx    ; AX = offset a + offset b  (AX=206)   (correct, but not what we expect)\n" +
                    "\n" +
                    "\n" +
                    "; correct syntax for fasm:\n" +
                    "mov ax, [a]\n" +
                    "mov bx, [b]\n" +
                    "add ax, bx    ; AX = 5 + 7   (AX=000C)     (correct)\n" +
                    "\n" +
                    " \n" +
                    ";; to calculate sum of offsets for emu8086 integrated assembler\n" +
                    ";; it is required to use the offset directive, for example:\n" +
                    ";    mov ax, offset a\n" +
                    ";    mov bx, offset b\n" +
                    ";    add ax, bx    ; sum of offsets instead of values.             \n" +
                    ";; the offset directive is not supported for fasm (error: extra characters on line)\n" +
                    "      \n" +
                    "        \n" +
                    "; Hello, World example in fasm:        \n" +
                    "mov dx, msg\n" +
                    "mov ah, 9\n" +
                    "int 21h  \n" +
                    "\n" +
                    "; for emu8086 integrated assembler:\n" +
                    ";    mov dx, offset msg\n" +
                    "; or\n" +
                    ";    lea dx, msg\n" +
                    "; (syntax of the integrated 8086 assembler is mostly MASM/TASM compatible)\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key...\n" +
                    "mov ah, 0\n" +
                    "int 16h  \n" +
                    " \n" +
                    "ret \n" +
                    "\n" +
                    "msg db \"Hello, World!\", 0x0D, 0x0A, \"$\"\n" +
                    "   \n" +
                    "; emu8086 compatible declaration is:\n" +
                    "; msg: db \"Hello, World!\", 0x0D, 0x0A, \"$\"\n" +
                    ";  (note: there is \":\" after msg)\n" +
                    "   \n" +
                    "                                 \n" +
                    "                                   \n" +
                    "; === [NOTE 2]  \n" +
                    "; fasm does not support the comment directive, for example:\n" +
                    "; comment *\n" +
                    ";    la lalala la...\n" +
                    "; *      \n" +
                    "\n" +
                    "; === [NOTE 3]     \n" +
                    "; these precompiler directives are preparsed by the IDE:\n" +
                    ";  NAME\n" +
                    ";  #make...\n" +
                    ";  #AX=...\n" +
                    ";  etc...\n" +
                    "          \n" +
                    "\n" +
                    "; === [NOTE 4]  \n" +
                    "; for fasm it's required to use \"byte\" and \"word\" prefixes\n" +
                    "; in places where it may be required to use \"byte ptr\", \"word ptr\"\n" +
                    "; or \"b.\", \"w.\" prefixes for the integrated 8086 assembler. \n" +
                    "; For example:\n" +
                    "           \n" +
                    "           \n" +
                    "mov byte [m1], AL           \n" +
                    "m1 dw 1234h\n" +
                    "\n" +
                    ";\t; for the integrated 8086 assembler it should be:\n" +
                    ";\tmov b. m1, AL             \n" +
                    ";\t; or:\n" +
                    ";\tmov byte ptr m1, AL  ; (MASM compatible)\n" +
                    "\t               \n" +
                    "               \n" +
                    "; === [NOTE 5] \n" +
                    "; uninitialised variables are not added to actual binary file\n" +
                    "; when these variables are located in the bottom of the file\n" +
                    "; and there is no defined data after them (MASM compatible)\n" +
                    "; 8086 assembler always initialises variables as 0 (MASM incompatibility)\n" +
                    "; For example:\n" +
                    "\n" +
                    "u1 dw ?   \n" +
                    "\n" +
                    "\n" +
                    "; === [NOTE 6] \n" +
                    "; fasm assembler is case sensitive;\n" +
                    "; for example, the following code would cause\n" +
                    "; \"symbol redefinition\" error for MASM or 8086 integrated assembler,\n" +
                    "; but it is completely legal for fasm:\n" +
                    "\n" +
                    "mov [d], 9\n" +
                    "mov [D], 12\n" +
                    "ret\n" +
                    "d Dw 5\n" +
                    "D dw 7\n" +
                    "\n" +
                    "; === [NOTE 7]   \n" +
                    "; there may be other slight syntax incompatibilities,\n" +
                    "; if you find any problem feel free to email.\n" +
                    "   \n",





            "name \"fileio\"\n" +
                    "\n" +
                    "; general rules for file system emulation:\n" +
                    "\n" +
                    "; 1. the emulator emulates all drive paths in c:\\emu8086\\vdrive\\\n" +
                    ";    for example: the real path for \"c:\\test1\" is \"c:\\emu8086\\vdrive\\c\\test1\"\n" +
                    "\n" +
                    "; 2. paths without drive letter are emulated to c:\\emu8086\\MyBuild\\\n" +
                    ";    for example: the real path for \"myfile.txt\" is \"c:\\emu8086\\MyBuild\\myfile.txt\"\n" +
                    "\n" +
                    "; 3. if compiled file is running outside of the emulator rules 1 and 2 do not apply.\n" +
                    "\n" +
                    "; ==================================================================================\n" +
                    "; run this example slowly in step-by-step mode and observe what it does.\n" +
                    "; ==================================================================================\n" +
                    "\n" +
                    "org  100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "dir1 db \"c:\\test1\", 0\n" +
                    "dir2 db \"test2\", 0\n" +
                    "dir3 db \"newname\", 0\n" +
                    "file1 db \"c:\\test1\\file1.txt\", 0\n" +
                    "file2 db \"c:\\test1\\newfile.txt\", 0\n" +
                    "file3 db \"t1.txt\", 0\n" +
                    "handle dw ?\n" +
                    "\n" +
                    "text db \"lazy dog jumps over red fox.\"\n" +
                    "text_size = $ - offset text\n" +
                    "text2 db \"hi!\"\n" +
                    "text2_size = $ - offset text2\n" +
                    "\n" +
                    "start:\n" +
                    "mov ax, cs\n" +
                    "mov dx, ax\n" +
                    "mov es, ax\n" +
                    "\n" +
                    "\n" +
                    "; create c:\\emu8086\\vdrive\\C\\test1\n" +
                    "mov dx, offset dir1\n" +
                    "mov ah, 39h\n" +
                    "int 21h\n" +
                    "\n" +
                    "; create  c:\\emu8086\\MyBuild\\test2\n" +
                    "mov dx, offset dir2\n" +
                    "mov ah, 39h\n" +
                    "int 21h\n" +
                    "\n" +
                    "; rename directory: c:\\emu8086\\MyBuild\\test2 to c:\\emu8086\\MyBuild\\newname\n" +
                    "mov ah, 56h\n" +
                    "mov dx, offset dir2   ; existing.\n" +
                    "mov di, offset dir3   ; new.\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; create and open file: c:\\emu8086\\vdrive\\C\\test1\\file1.txt\n" +
                    "mov ah, 3ch\n" +
                    "mov cx, 0\n" +
                    "mov dx, offset file1\n" +
                    "int 21h\n" +
                    "jc err\n" +
                    "mov handle, ax\n" +
                    "; write to file:\n" +
                    "mov ah, 40h\n" +
                    "mov bx, handle\n" +
                    "mov dx, offset text\n" +
                    "mov cx, text_size\n" +
                    "int 21h\n" +
                    "; close c:\\emu8086\\vdrive\\C\\test1\\file1.txt\n" +
                    "mov ah, 3eh\n" +
                    "mov bx, handle\n" +
                    "int 21h\n" +
                    "err:\n" +
                    "nop\n" +
                    "\n" +
                    "\n" +
                    "; rename fileL c:\\emu8086\\vdrive\\C\\test1\\file1.txt to c:\\test1\\newfile.txt\n" +
                    "mov ah, 56h\n" +
                    "mov dx, offset file1   ; existing.\n" +
                    "mov di, offset file2   ; new.\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; delete file c:\\emu8086\\vdrive\\C\\test1\\newfile.txt\n" +
                    "mov ah, 41h\n" +
                    "mov dx, offset file2\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; delete directory: c:\\emu8086\\vdrive\\C\\test1\n" +
                    "mov ah, 3ah\n" +
                    "mov dx, offset dir1\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; create and open file: c:\\emu8086\\MyBuild\\t1.txt\n" +
                    "mov ah, 3ch\n" +
                    "mov cx, 0\n" +
                    "mov dx, offset file3\n" +
                    "int 21h\n" +
                    "jc err2\n" +
                    "mov handle, ax\n" +
                    "; seek:\n" +
                    "mov ah, 42h\n" +
                    "mov bx, handle\n" +
                    "mov al, 0\n" +
                    "mov cx, 0\n" +
                    "mov dx, 10\n" +
                    "int 21h\n" +
                    "; write to file:\n" +
                    "mov ah, 40h\n" +
                    "mov bx, handle\n" +
                    "mov dx, offset text\n" +
                    "mov cx, text_size\n" +
                    "int 21h\n" +
                    "; seek:\n" +
                    "mov ah, 42h\n" +
                    "mov bx, handle\n" +
                    "mov al, 0\n" +
                    "mov cx, 0\n" +
                    "mov dx, 2\n" +
                    "int 21h\n" +
                    "; write to file:\n" +
                    "mov ah, 40h\n" +
                    "mov bx, handle\n" +
                    "mov dx, offset text2\n" +
                    "mov cx, text2_size\n" +
                    "int 21h\n" +
                    "; close c:\\emu8086\\MyBuild\\t1.txt\n" +
                    "mov ah, 3eh\n" +
                    "mov bx, handle\n" +
                    "int 21h\n" +
                    "err2:\n" +
                    "nop\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; delete file  c:\\emu8086\\MyBuild\\t1.txt\n" +
                    "mov ah, 41h\n" +
                    "mov dx, offset file3\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; delete directory: c:\\emu8086\\MyBuild\\newname\n" +
                    "mov ah, 3ah\n" +
                    "mov dx, offset dir3\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "ret\n",







            "; calculate equation with high precision without math coprocessor\n" +
                    "          \n" +
                    "; this program calculates linear equation: ax + b = 0\n" +
                    "; the result is printed with floating point.\n" +
                    "\n" +
                    "; for example: a = 7, b = 2\n" +
                    ";              x = -0.28571428....\n" +
                    "\n" +
                    "name \"float\"  \n" +
                    "\n" +
                    "precision = 30  ; max digits after the dot.\n" +
                    "\n" +
                    "   \n" +
                    "dseg    segment 'data'\n" +
                    "cr              equ     0Dh\n" +
                    "lf              equ     0Ah\n" +
                    "new_line        equ     0Dh,0Ah, '$'\n" +
                    "mess0           db      'calculation of ax + b = 0', new_line\n" +
                    "mess1           db      'enter a (-32768..32767)!', new_line\n" +
                    "mess2           db      lf, cr, 'enter b (-32768..32767)!', new_line\n" +
                    "mess3           db      cr, lf, cr, lf, 'data:', '$'\n" +
                    "mess4           db      cr, lf, ' a = ', '$'\n" +
                    "mess5           db      cr, lf, ' b = ', '$'\n" +
                    "mess6           db      cr, lf, 'result: ', cr, lf, ' x = ', '$'\n" +
                    "mess7           db      cr, lf, cr, lf, 'no solution!', new_line\n" +
                    "mess8           db      cr, lf, cr, lf, 'infinite number of solutions!', new_line\n" +
                    "error           db      cr, lf, 'the number is out of range!', new_line\n" +
                    "twice_nl        db      new_line, new_line \n" +
                    "make_minus      db      ?       ; used as a flag in procedures.\n" +
                    "a               dw      ?\n" +
                    "b               dw      ?\n" +
                    "ten             dw      10      ; used as multiplier.\n" +
                    "four            dw      4       ; used as divider.\n" +
                    "dseg    ends\n" +
                    "\n" +
                    "sseg    segment stack   'stack'\n" +
                    "                dw      100h    dup(?)\n" +
                    "sseg    ends\n" +
                    "\n" +
                    "cseg    segment 'code'\n" +
                    "\n" +
                    ";*******************************************************************\n" +
                    "\n" +
                    "start           proc    far\n" +
                    "\n" +
                    "; store return address to os:\n" +
                    "                push    ds\n" +
                    "                xor     ax, ax\n" +
                    "                push    ax\n" +
                    "                \n" +
                    "; set segment registers:                \n" +
                    "                mov     ax, dseg\n" +
                    "                mov     ds, ax\n" +
                    "                mov     es, ax\n" +
                    "\n" +
                    "; welcome message:\n" +
                    "                lea     dx, mess0\n" +
                    "                call    puts            ; display the message.\n" +
                    "\n" +
                    "; ask for 'a' :\n" +
                    "                lea     dx, mess1\n" +
                    "                call    puts            ; display the message.\n" +
                    "                call    scan_num        ; input the number into cx.\n" +
                    "                mov     a, cx\n" +
                    "\n" +
                    "; ask for 'b' :\n" +
                    "                lea     dx, mess2\n" +
                    "                call    puts            ; display the message.\n" +
                    "                call    scan_num        ; input the number into cx.\n" +
                    "                mov     b, cx\n" +
                    "\n" +
                    "; print the data:\n" +
                    "                lea     dx, mess3\n" +
                    "                call    puts\n" +
                    "\n" +
                    "                lea     dx, mess4\n" +
                    "                call    puts\n" +
                    "                mov     ax, a\n" +
                    "                call    print_num               ; print ax.\n" +
                    "\n" +
                    "                lea     dx, mess5\n" +
                    "                call    puts\n" +
                    "                mov     ax, b\n" +
                    "                call    print_num               ; print ax.\n" +
                    "\n" +
                    "\n" +
                    "; check data:\n" +
                    "                cmp     a, 0\n" +
                    "                jne     soluble         ; jumps when a<>0.\n" +
                    "                cmp     b, 0\n" +
                    "                jne     no_solution     ; jumps when a=0 and b<>0.\n" +
                    "                jmp     infinite        ; jumps when a=0 and b=0.\n" +
                    "soluble:\n" +
                    "\n" +
                    "; calculate the solution:\n" +
                    "; ax + b = 0  ->  ax = -b  ->  x = -b/a\n" +
                    "\n" +
                    "                neg     b\n" +
                    "\n" +
                    "                mov     ax, b\n" +
                    "\n" +
                    "                xor     dx, dx\n" +
                    "\n" +
                    "                ; check the sign, make dx:ax negative if ax is negative:\n" +
                    "                cmp     ax, 0\n" +
                    "                jns     not_singned\n" +
                    "                not     dx\n" +
                    "not_singned:\n" +
                    "                mov     bx, a   ; divider is in bx.\n" +
                    "\n" +
                    "                ; '-b' is in dx:ax.\n" +
                    "                ; 'a' is in bx.\n" +
                    "\n" +
                    "                idiv    bx      ; ax = dx:ax / bx       (dx - remainder).\n" +
                    "\n" +
                    "                ; 'x' is in ax.\n" +
                    "                ; remainder is in dx.\n" +
                    "\n" +
                    "                push    dx      ; store the remainder.\n" +
                    "\n" +
                    "                lea     dx, mess6\n" +
                    "                call    puts\n" +
                    "\n" +
                    "                pop     dx\n" +
                    "\n" +
                    "                ; print 'x' as float:\n" +
                    "                ; ax - whole part\n" +
                    "                ; dx - remainder\n" +
                    "                ; bx - divider\n" +
                    "                call    print_float\n" +
                    "\n" +
                    "                jmp     end_prog\n" +
                    "no_solution:\n" +
                    "                lea     dx, mess7\n" +
                    "                call    puts\n" +
                    "                jmp     end_prog\n" +
                    "infinite:\n" +
                    "                lea     dx, mess8\n" +
                    "                call    puts\n" +
                    "end_prog:\n" +
                    "                lea     dx, twice_nl\n" +
                    "                call    puts\n" +
                    "                \n" +
                    "                ; wait for any key....\n" +
                    "                mov     ah, 0\n" +
                    "                int     16h\n" +
                    "                \n" +
                    "                \n" +
                    "                ret\n" +
                    " start          endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; prints number in ax and it's fraction in dx.\n" +
                    "; used to print remainder of 'div/idiv bx'.\n" +
                    "; ax - whole part.\n" +
                    "; dx - remainder.\n" +
                    "; bx - the divider that was used to get the remainder from divident.\n" +
                    "print_float     proc    near\n" +
                    "        push    cx\n" +
                    "        push    dx\n" +
                    "\n" +
                    "        ; because the remainder takes the sign of divident\n" +
                    "        ; its sign should be inverted when divider is negative\n" +
                    "        ; (-) / (-) = (+)\n" +
                    "        ; (+) / (-) = (-)\n" +
                    "        cmp     bx, 0\n" +
                    "        jns     div_not_signed\n" +
                    "        neg     dx              ; make remainder positive.\n" +
                    "div_not_signed:\n" +
                    "\n" +
                    "        ; print_num procedure does not print the '-'\n" +
                    "        ; when the whole part is '0' (even if the remainder is\n" +
                    "        ; negative) this code fixes it:\n" +
                    "        cmp     ax, 0\n" +
                    "        jne     checked         ; ax<>0\n" +
                    "        cmp     dx, 0\n" +
                    "        jns     checked         ; ax=0 and dx>=0\n" +
                    "        push    dx\n" +
                    "        mov     dl, '-'\n" +
                    "        call    write_char      ; print '-'\n" +
                    "        pop     dx\n" +
                    "checked:\n" +
                    "\n" +
                    "        ; print whole part:\n" +
                    "        call    print_num\n" +
                    "\n" +
                    "        ; if remainder=0, then no need to print it:\n" +
                    "        cmp     dx, 0\n" +
                    "        je      done\n" +
                    "\n" +
                    "        push    dx\n" +
                    "        ; print dot after the number:\n" +
                    "        mov     dl, '.'\n" +
                    "        call    write_char\n" +
                    "        pop     dx\n" +
                    "\n" +
                    "        ; print digits after the dot:\n" +
                    "        mov     cx, precision\n" +
                    "        call    print_fraction\n" +
                    "done:\n" +
                    "        pop     dx\n" +
                    "        pop     cx\n" +
                    "        ret\n" +
                    "print_float     endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; prints dx as fraction of division by bx.\n" +
                    "; dx - remainder.\n" +
                    "; bx - divider.\n" +
                    "; cx - maximum number of digits after the dot.\n" +
                    "print_fraction  proc    near\n" +
                    "        push    ax\n" +
                    "        push    dx\n" +
                    "next_fraction:\n" +
                    "        ; check if all digits are already printed:\n" +
                    "        cmp     cx, 0\n" +
                    "        jz      end_rem\n" +
                    "        dec     cx      ; decrease digit counter.\n" +
                    "\n" +
                    "        ; when remainder is '0' no need to continue:\n" +
                    "        cmp     dx, 0\n" +
                    "        je      end_rem\n" +
                    "\n" +
                    "        mov     ax, dx\n" +
                    "        xor     dx, dx\n" +
                    "        cmp     ax, 0\n" +
                    "        jns     not_sig1\n" +
                    "        not     dx\n" +
                    "not_sig1:\n" +
                    "\n" +
                    "        imul    ten             ; dx:ax = ax * 10\n" +
                    "\n" +
                    "        idiv    bx              ; ax = dx:ax / bx   (dx - remainder)\n" +
                    "\n" +
                    "        push    dx              ; store remainder.\n" +
                    "        mov     dx, ax\n" +
                    "        cmp     dx, 0\n" +
                    "        jns     not_sig2\n" +
                    "        neg     dx\n" +
                    "not_sig2:\n" +
                    "        add     dl, 30h         ; convert to ascii code.\n" +
                    "        call    write_char      ; print dl.\n" +
                    "        pop     dx\n" +
                    "\n" +
                    "        jmp     next_fraction\n" +
                    "end_rem:\n" +
                    "        pop     dx\n" +
                    "        pop     ax\n" +
                    "        ret\n" +
                    "print_fraction  endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; this procedure prints number in ax,\n" +
                    "; used with print_numx to print \"0\" and sign.\n" +
                    "; this procedure also stores the original ax,\n" +
                    "; that is modified by print_numx.\n" +
                    "print_num       proc    near\n" +
                    "        push    dx\n" +
                    "        push    ax\n" +
                    "\n" +
                    "        cmp     ax, 0\n" +
                    "        jnz     not_zero\n" +
                    "\n" +
                    "        mov     dl, '0'\n" +
                    "        call    write_char\n" +
                    "        jmp     printed\n" +
                    "\n" +
                    "not_zero:\n" +
                    "        ; the check sign of ax,\n" +
                    "        ; make absolute if it's negative:\n" +
                    "        cmp     ax, 0\n" +
                    "        jns     positive\n" +
                    "        neg     ax\n" +
                    "\n" +
                    "        mov     dl, '-'\n" +
                    "        call    write_char\n" +
                    "positive:\n" +
                    "        call    print_numx\n" +
                    "printed:\n" +
                    "        pop     ax\n" +
                    "        pop     dx\n" +
                    "        ret\n" +
                    "print_num       endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; prints out a number in ax (not just a single digit)\n" +
                    "; allowed values from 1 to 65535 (ffff)\n" +
                    "; (result of /10000 should be the left digit or \"0\").\n" +
                    "; modifies ax (after the procedure ax=0)\n" +
                    "print_numx      proc    near\n" +
                    "        push    bx\n" +
                    "        push    cx\n" +
                    "        push    dx\n" +
                    "\n" +
                    "        ; flag to prevent printing zeros before number:\n" +
                    "        mov     cx, 1\n" +
                    "\n" +
                    "        mov     bx, 10000       ; 2710h - divider.\n" +
                    "\n" +
                    "        ; check if ax is zero, if zero go to end_show\n" +
                    "        cmp     ax, 0\n" +
                    "        jz      end_show\n" +
                    "\n" +
                    "begin_print:\n" +
                    "\n" +
                    "        ; check divider (if zero go to end_show):\n" +
                    "        cmp     bx,0\n" +
                    "        jz      end_show\n" +
                    "\n" +
                    "        ; avoid printing zeros before number:\n" +
                    "        cmp     cx, 0\n" +
                    "        je      calc\n" +
                    "        ; if ax<bx then result of div will be zero:\n" +
                    "        cmp     ax, bx\n" +
                    "        jb      skip\n" +
                    "calc:\n" +
                    "        xor     cx, cx  ; set flag.\n" +
                    "\n" +
                    "        xor     dx, dx\n" +
                    "        div     bx      ; ax = dx:ax / bx   (dx=remainder).\n" +
                    "\n" +
                    "        ; print last digit\n" +
                    "        ; ah is always zero, so it's ignored\n" +
                    "        push    dx\n" +
                    "        mov     dl, al\n" +
                    "        add     dl, 30h    ; convert to ascii code.\n" +
                    "        call    write_char\n" +
                    "        pop     dx\n" +
                    "\n" +
                    "        mov     ax, dx  ; get remainder from last div.\n" +
                    "\n" +
                    "skip:\n" +
                    "        ; calculate bx=bx/10\n" +
                    "        push    ax\n" +
                    "        xor     dx, dx\n" +
                    "        mov     ax, bx\n" +
                    "        div     ten     ; ax = dx:ax / 10   (dx=remainder).\n" +
                    "        mov     bx, ax\n" +
                    "        pop     ax\n" +
                    "\n" +
                    "        jmp     begin_print\n" +
                    "\n" +
                    "end_show:\n" +
                    "\n" +
                    "        pop     dx\n" +
                    "        pop     cx\n" +
                    "        pop     bx\n" +
                    "        ret\n" +
                    "print_numx      endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; displays the message (dx-address)\n" +
                    "puts    proc    near\n" +
                    "        push    ax\n" +
                    "        mov     ah, 09h\n" +
                    "        int     21h\n" +
                    "        pop     ax\n" +
                    "        ret\n" +
                    "puts    endp\n" +
                    "\n" +
                    ";*******************************************************************\n" +
                    "\n" +
                    "; reads char from the keyboard into al\n" +
                    "; (modifies ax!!!)\n" +
                    "read_char       proc    near\n" +
                    "        mov     ah, 01h\n" +
                    "        int     21h\n" +
                    "        ret\n" +
                    "read_char       endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; gets the multi-digit signed number from the keyboard,\n" +
                    "; result is stored in cx. backspace is not supported, for backspace\n" +
                    "; enabled input function see c:\\emu8086\\inc\\emu8086.inc\n" +
                    "scan_num        proc    near\n" +
                    "        push    dx\n" +
                    "        push    ax\n" +
                    "\n" +
                    "        xor     cx, cx\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        mov     make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "        call    read_char\n" +
                    "\n" +
                    "        ; check for minus:\n" +
                    "        cmp     al, '-'\n" +
                    "        je      set_minus\n" +
                    "\n" +
                    "        ; check for enter key:\n" +
                    "        cmp     al, cr\n" +
                    "        je      stop_input\n" +
                    "\n" +
                    "        ; multiply cx by 10 (first time the result is zero)\n" +
                    "        push    ax\n" +
                    "        mov     ax, cx\n" +
                    "        mul     ten                     ; dx:ax = ax*10\n" +
                    "        mov     cx, ax\n" +
                    "        pop     ax\n" +
                    "\n" +
                    "        ; check if the number is too big\n" +
                    "        ; (result should be 16 bits)\n" +
                    "        cmp     dx, 0\n" +
                    "        jne     out_of_range\n" +
                    "\n" +
                    "        ; convert from ascii code:\n" +
                    "        sub     al, 30h\n" +
                    "\n" +
                    "        ; add al to cx:\n" +
                    "        xor     ah, ah\n" +
                    "        add     cx, ax\n" +
                    "        jc      out_of_range    ; jump if the number is too big.\n" +
                    "\n" +
                    "        jmp     next_digit\n" +
                    "\n" +
                    "set_minus:\n" +
                    "        mov     make_minus, 1\n" +
                    "        jmp     next_digit\n" +
                    "\n" +
                    "out_of_range:\n" +
                    "        lea     dx, error\n" +
                    "        call    puts\n" +
                    "\n" +
                    "stop_input:\n" +
                    "        ; check flag:\n" +
                    "        cmp     make_minus, 0\n" +
                    "        je      not_minus\n" +
                    "        neg     cx\n" +
                    "not_minus:\n" +
                    "\n" +
                    "        pop     ax\n" +
                    "        pop     dx\n" +
                    "        ret\n" +
                    "scan_num        endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "; prints out single char (ascii code should be in dl)\n" +
                    "write_char      proc    near\n" +
                    "        push    ax\n" +
                    "        mov     ah, 02h\n" +
                    "        int     21h\n" +
                    "        pop     ax\n" +
                    "        ret\n" +
                    "write_char      endp\n" +
                    "\n" +
                    ";***************************************************************\n" +
                    "\n" +
                    "cseg    ends\n" +
                    "        end     start\n",






            "; \"hello, world!\" step-by-step char-by-char way...\n" +
                    "; this is very similar to what int 21h/9h does behind your eyes.\n" +
                    "; instead of $, the string in this example is zero terminated\n" +
                    "; (the Microsoft Corporation has selected dollar to terminate the strings for MS-DOS operating system)\n" +
                    " \n" +
                    "name \"hello\"\n" +
                    "\n" +
                    "org     100h   ; compiler directive to make tiny com file.\n" +
                    "\n" +
                    "; execution starts here, jump over the data string:\n" +
                    "jmp     start\n" +
                    "\n" +
                    "; data string:\n" +
                    "msg db 'Hello, world!', 0\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; set the index register:\n" +
                    "        mov     si, 0\n" +
                    "\n" +
                    "next_char:\n" +
                    "\n" +
                    "; get current character:\n" +
                    "        mov     al, msg[si]\n" +
                    "; is it zero?\n" +
                    "; if so stop printing:\n" +
                    "        cmp     al, 0           \n" +
                    "        je      stop\n" +
                    "\n" +
                    "; print character in teletype mode:\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h\n" +
                    "\n" +
                    "; update index register by 1:\n" +
                    "        inc     si\n" +
                    "\n" +
                    "; go back to print another char:\n" +
                    "        jmp     next_char\n" +
                    "\n" +
                    "\n" +
                    "stop:  mov ah, 0  ; wait for any key press.\n" +
                    "       int 16h\n" +
                    "\n" +
                    "; exit here and return control to operating system...\n" +
                    "        ret     \n" +
                    "\n" +
                    "end     ; to stop compiler.\n" +
                    "\n" +
                    "this text is not compiled and is not checked for errors,\n" +
                    "because it is after the end directive;\n" +
                    "however, syntax highlight still works here.\n" +
                    "\n",






            "; hex convertor.\n" +
                    "; this example converts a 2 digit hexadecimal number\n" +
                    "; into a numeric value and then into decimal/ascii string representation, \n" +
                    "; and finally it prints out the result in binary code.\n" +
                    "\n" +
                    "; to see decimal string:\n" +
                    ";   1. click \"vars\"\n" +
                    ";   2. click \"result\" variable\n" +
                    ";   3. enter \"3\" for the elements and \"ascii\" for show as.\n" +
                    "\n" +
                    "\n" +
                    "name \"hex\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "; source hex value is 2 char string.\n" +
                    "; numeric value is stored into temp,\n" +
                    "; and string decimal value is stored into result.\n" +
                    "\n" +
                    "source db '1b', 0     ; 1bh is converted to 27 (decimal) 00011011b (binary)\n" +
                    "result db '000', 0\n" +
                    "temp   dw ?\n" +
                    "\n" +
                    "start:\n" +
                    "; convert first digit to value 0..15 from ascii:\n" +
                    "mov al, source[0]\n" +
                    "cmp al, '0'\n" +
                    "jae  f1\n" +
                    "\n" +
                    "f1:\n" +
                    "cmp al, '9'\n" +
                    "ja f2     ; jumps only if not '0' to '9'.\n" +
                    "\n" +
                    "sub al, 30h  ; convert char '0' to '9' to numeric value.\n" +
                    "jmp num1_ready\n" +
                    "\n" +
                    "f2:\n" +
                    "; gets here if it's 'a' to 'f' case:\n" +
                    "or al, 00100000b   ; remove upper case (if any).\n" +
                    "sub al, 57h  ;  convert char 'a' to 'f' to numeric value.\n" +
                    "\n" +
                    "num1_ready:\n" +
                    "mov bl, 16\n" +
                    "mul bl      ; ax = al * bl\n" +
                    "\n" +
                    "mov temp, ax\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; convert second digit to value 0..15 from ascii:\n" +
                    "mov al, source[1]\n" +
                    "cmp al, '0'\n" +
                    "jae  g1\n" +
                    "\n" +
                    "g1:\n" +
                    "cmp al, '9'\n" +
                    "ja g2     ; jumps only if not '0' to '9'.\n" +
                    "\n" +
                    "sub al, 30h  ; convert char '0' to '9' to numeric value.\n" +
                    "jmp num2_ready\n" +
                    "\n" +
                    "g2:\n" +
                    "; gets here if it's 'a' to 'f' case:\n" +
                    "or al, 00100000b   ; remove upper case (if any).\n" +
                    "sub al, 57h  ;  convert char 'a' to 'f' to numeric value.\n" +
                    "\n" +
                    "num2_ready:\n" +
                    "xor ah, ah \n" +
                    "add temp, ax  \n" +
                    "; convertion from hex string complete!\n" +
                    "push temp ; store original temp value.\n" +
                    "\n" +
                    "; convert to decimal string,\n" +
                    "; it has to be 3 decimal digits or less:\n" +
                    "\n" +
                    "mov di, 2  ; point to top of the string.\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "cmp temp, 0\n" +
                    "je stop\n" +
                    "\n" +
                    "mov ax, temp\n" +
                    "mov bl, 10\n" +
                    "div bl ; al = ax / operand, ah = remainder.\n" +
                    "mov result[di], ah\n" +
                    "add result[di], 30h ; convert to ascii.\n" +
                    "\n" +
                    "xor ah, ah\n" +
                    "mov temp, ax\n" +
                    "\n" +
                    "dec di  ; next digit in string.\n" +
                    "jmp next_digit\n" +
                    "\n" +
                    "stop:\n" +
                    "pop temp ; re-store original temp value.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov bl, b.temp\n" +
                    "mov cx, 8\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov dl, '0'\n" +
                    "       test bl, 10000000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov dl, '1'\n" +
                    "zero:  int 21h\n" +
                    "       shl bl, 1\n" +
                    "loop print\n" +
                    "\n" +
                    "; print binary suffix:\n" +
                    "mov dl, 'b'\n" +
                    "int 21h\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ret  ; return to operating system."





            ,"; this is an example of bios function: int 10h / ah=13h.\n" +
            "; refer to short list of dos interrupts for more info:\n" +
            "; c:\\emu8086\\documentation\\\n" +
            "\n" +
            "name \"int10h\"\n" +
            "\n" +
            "org     100h\n" +
            "\n" +
            "\n" +
            "; set es (just in case):\n" +
            "push    cs\n" +
            "pop     es\n" +
            "\n" +
            "mov     bh, 0    ; page.\n" +
            "lea     bp, msg  ; offset.\n" +
            "mov     bl, 0f3h ; default attribute.\n" +
            "mov     cx, 12   ; char number.\n" +
            "mov     dl, 2    ; col.\n" +
            "mov     dh, 1    ; row.\n" +
            "mov     ah, 13h  ; function.\n" +
            "mov     al, 1    ; sub-function.\n" +
            "int     10h\n" +
            "\n" +
            "; show current cursor position:\n" +
            "mov     al, '<'  \n" +
            "mov     ah, 0eh\n" +
            "int     10h\n" +
            "\n" +
            "mov     bh, 0    ; page.\n" +
            "lea     bp, cmsg ; offset of string with attributes.\n" +
            "mov     bl, 0f3h ; default attribute (not used when al=3).\n" +
            "mov     cx, 12   ; char number.\n" +
            "mov     dl, 2    ; col.\n" +
            "mov     dh, 3    ; row.\n" +
            "mov     ah, 13h  ; function.\n" +
            "mov     al, 3    ; sub-function.\n" +
            "int     10h\n" +
            "\n" +
            "; show current cursor position:\n" +
            "mov     al, '<'\n" +
            "mov     ah, 0eh\n" +
            "int     10h\n" +
            "\n" +
            "; wait for any key press....\n" +
            "mov     ah, 0\n" +
            "int     16h\n" +
            "\n" +
            "ret  ; return control to the operating system.\n" +
            "\n" +
            "msg db 'hello world!'\n" +
            "\n" +
            "cmsg db 'h', 0cfh, 'e', 8bh, 'l', 0f0h, 'l', 5fh, 'o', 3ch, ' ', 0e0h\n" +
            "     db 'w', 0b3h, 'o', 2eh, 'r', 0cah, 'l', 1ah, 'd', 0ach, '!', 2fh\n" +
            "\n",








            "; this sample gets a string from a user, then it prints it out.\n" +
                    "; this example uses dos interrupt: 21h\n" +
                    "\n" +
                    "name \"int21\"\n" +
                    "\n" +
                    "org  100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "\n" +
                    "; when no file path is specified the default file path is:\n" +
                    ";   c:\\emu8086\\MyBuild\n" +
                    "\n" +
                    "; if path is specified, it is emulated in:\n" +
                    ";   c:\\emu8086\\vdrive\\\n" +
                    "; for example, c:\\test.txt is c:\\emu8086\\vdrive\\c\\test.txt\n" +
                    "; this is done to prevent disasters and accidental overwriting of valuable files.\n" +
                    "; relative paths such as \"c:\\mydir\\..\\autoexec.bat\" are disabled for the same reasons.\n" +
                    "\n" +
                    "\n" +
                    "; declarations:\n" +
                    "\n" +
                    "; buffers hold ascii chars for INT 21h/0Ah input function,\n" +
                    "; first byte is its maximum size, second byte: actual size.\n" +
                    "\n" +
                    "; format of INT 21h/0Ah input buffer:\n" +
                    ";  -byte-offset-     -number-of-bytes-             -description- \n" +
                    ";      00                  1                        buffer size\n" +
                    ";      01                  1                        number of characters actually read (excluding cr).\n" +
                    ";      02             1 to buffer-size              actual buffer contents (including cr). \n" +
                    "\n" +
                    "s1        db 100,?, 100 dup(' ') \n" +
                    "t2        db 100,?, 100 dup(' ')\n" +
                    "filename  db 30,?, 30 dup(' ')   ; file name should be in 8.3 - dos compatible format.\n" +
                    "\n" +
                    "\n" +
                    "; file handle:\n" +
                    "handle   dw   0\n" +
                    "\n" +
                    "\n" +
                    "; set segment registers to code:\n" +
                    "start:  mov ax, cs\n" +
                    "        mov ds, ax\n" +
                    "        mov es, ax\n" +
                    "\n" +
                    "jmp m1\n" +
                    "msg1    db  \"enter any text: $\"\n" +
                    "m1:     mov dx, offset msg1\n" +
                    "        mov ah, 9\n" +
                    "        int 21h\n" +
                    "; input a string:\n" +
                    "        mov dx, offset s1\n" +
                    "        mov ah, 0ah\n" +
                    "        int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "jmp m2\n" +
                    "msg2    db  0Dh,0Ah,\"enter file name: $\"\n" +
                    "m2:     mov dx, offset msg2\n" +
                    "        mov ah, 9\n" +
                    "        int 21h\n" +
                    "; input filename:\n" +
                    "        mov dx, offset filename\n" +
                    "        mov ah, 0ah\n" +
                    "        int 21h\n" +
                    "\n" +
                    "; set 0 to the end of the filename:\n" +
                    "        xor bx, bx\n" +
                    "        mov bl, filename[1]  ; get actual size.\n" +
                    "        mov filename[bx+2], 0\n" +
                    "\n" +
                    "; create new file:\n" +
                    "        mov cx, 0\n" +
                    "        mov ah, 3ch\n" +
                    "        mov dx, offset filename+2\n" +
                    "        int 21h\n" +
                    "        jc  error\n" +
                    "        mov handle, ax\n" +
                    "; write buffer to file:\n" +
                    "        mov ah, 40h\n" +
                    "        mov bx, handle        \n" +
                    "        mov dx, offset s1+2\n" +
                    "        xor cx, cx\n" +
                    "        mov cl, s1[1]\n" +
                    "        int 21h\n" +
                    "        jc  error\n" +
                    "; close file\n" +
                    "        mov bx, handle\n" +
                    "        mov ah, 3eh\n" +
                    "        int 21h\n" +
                    "        jc error\n" +
                    "        \n" +
                    "        \n" +
                    "        \n" +
                    "; open existing file:\n" +
                    "        mov al, 0     ; read.\n" +
                    "        mov ah, 3dh\n" +
                    "        mov dx, offset filename+2\n" +
                    "        int 21h\n" +
                    "        jc  error\n" +
                    "        mov handle, ax       \n" +
                    "; read bytes from file\n" +
                    "        mov ah, 3fh\n" +
                    "        mov bx, handle\n" +
                    "        xor cx, cx\n" +
                    "        mov cl, t2[0]\n" +
                    "        mov dx, offset t2[2]\n" +
                    "        int 21h\n" +
                    "        jc error\n" +
                    "        mov t2[1], al\n" +
                    "; close file\n" +
                    "        mov bx, handle\n" +
                    "        mov ah, 3eh\n" +
                    "        int 21h\n" +
                    "        jc error    \n" +
                    "jmp m3\n" +
                    "msg3    db  0Dh,0Ah,\"read from file: $\"\n" +
                    "m3:     mov dx, offset msg3\n" +
                    "        mov ah, 9\n" +
                    "        int 21h\n" +
                    "; set '$' to the end of the buffer:\n" +
                    "        xor bx, bx\n" +
                    "        mov bl, t2[1]        ; get actual size.\n" +
                    "        mov t2[bx+2], '$'\n" +
                    "; print the buffer:\n" +
                    "        mov dx, offset t2[2] ; skip 2 control bytes.\n" +
                    "        mov ah, 9\n" +
                    "        int 21h\n" +
                    "        \n" +
                    "        \n" +
                    "        jmp ok\n" +
                    "\n" +
                    "; print error message:\n" +
                    "error:  jmp m5\n" +
                    "        msg5    db  0Dh,0Ah,\"error...\",0Dh,0Ah,'$'\n" +
                    "        m5:     mov dx, offset msg5\n" +
                    "                mov ah, 9\n" +
                    "                int 21h\n" +
                    "\n" +
                    "\n" +
                    "ok:     \n" +
                    "jmp m4\n" +
                    "msg4    db  0Dh,0Ah,\"press any key...\",0Dh,0Ah,'$'\n" +
                    "m4:     mov dx, offset msg4\n" +
                    "        mov ah, 9\n" +
                    "        int 21h        \n" +
                    "        mov ah, 0\n" +
                    "        int 16h\n" +
                    "\n" +
                    "\n" +
                    "; exit to the operating system:\n" +
                    "        mov ah, 4ch\n" +
                    "        int 21h\n" +
                    "\n" +
                    "\n" +
                    "\n",






            "name \"loops\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "mov bx, 0  ; total step counter\n" +
                    "\n" +
                    "mov cx, 5\n" +
                    "k1: add bx, 1         \n" +
                    "    mov al, '1'\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h \n" +
                    "    push cx\n" +
                    "    mov cx, 5\n" +
                    "      k2: add bx, 1  \n" +
                    "      mov al, '2'\n" +
                    "      mov ah, 0eh\n" +
                    "      int 10h      \n" +
                    "      push cx\n" +
                    "         mov cx, 5\n" +
                    "         k3: add bx, 1 \n" +
                    "         mov al, '3'\n" +
                    "         mov ah, 0eh\n" +
                    "         int 10h\n" +
                    "         loop k3    ; internal in internal loop.\n" +
                    "      pop  cx\n" +
                    "      loop  k2      ; internal loop.\n" +
                    "    pop cx\n" +
                    "loop k1             ; external loop.\n" +
                    "\n" +
                    "\n" +
                    "; wait any key...\n" +
                    "mov ah, 1\n" +
                    "int 21h\n" +
                    "\n" +
                    "ret\n",






            "; matrix transpose sample (reverse rows with columns).\n" +
                    "\n" +
                    "name \"matrix\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start ; go to code...\n" +
                    "\n" +
                    "msg db \"to the view matrix click vars button,\", 0dh,0ah\n" +
                    "    db \" and set elements property to 3 for these items:\", 0dh,0ah, 0ah\n" +
                    "    db \"   matrix    \", 0dh,0ah\n" +
                    "    db \"   row1      \", 0dh,0ah\n" +
                    "    db \"   row2      \", 0dh,0ah, 0dh,0ah\n" +
                    "    db \"or add print-out support to this program...\", 0dh,0ah, '$'\n" +
                    "\n" +
                    "matrix_size equ 3\n" +
                    "\n" +
                    "; ----- matrix ------\n" +
                    "matrix     db 1,2,3\n" +
                    "row1       db 4,5,6\n" +
                    "row2       db 7,8,9\n" +
                    ";--------------------\n" +
                    "\n" +
                    "i dw ?\n" +
                    "j dw ?\n" +
                    "\n" +
                    "start:\n" +
                    "mov i, 0\n" +
                    "next_i:\n" +
                    "\n" +
                    "\t; j = i + 1\n" +
                    "\tmov cx, i\n" +
                    "\tinc cx\n" +
                    "\tmov j, cx\n" +
                    "\tnext_j:\n" +
                    "\t\n" +
                    "\t\tmov si, i\n" +
                    "\t\tmov bx, j\n" +
                    "\t\n" +
                    "\t\tmov al, matrix_size\n" +
                    "\t\tmov cx, si\n" +
                    "\t\tmul cl\n" +
                    "\t\tmov si, ax\t\n" +
                    "\t\tmov dl, matrix[si][bx]\n" +
                    "\t\t\n" +
                    "\t\tmov si, i\n" +
                    "\t\tmov al, matrix_size\n" +
                    "\t\tmul bl\n" +
                    "\t\tmov bx, ax\n" +
                    "\t\txchg matrix[bx][si], dl\n" +
                    "\t\t\n" +
                    "\t\tmov bx, j\n" +
                    "\t\tmov al, matrix_size\n" +
                    "\t\tmov cx, si\n" +
                    "\t\tmul cl\n" +
                    "\t\tmov si, ax\n" +
                    "\t\tmov matrix[si][bx], dl\n" +
                    "\t\n" +
                    "\tinc j\n" +
                    "\tcmp j, matrix_size\n" +
                    "\tjb next_j\t\n" +
                    "inc i\n" +
                    "cmp i, matrix_size/2\n" +
                    "jbe next_i\n" +
                    "\n" +
                    "\n" +
                    "; print message....\n" +
                    "lea dx, msg\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "; wait for any key press...\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n",






            "; mouse test\n" +
                    "\n" +
                    "name \"mouse\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "print macro x, y, attrib, sdat\n" +
                    "LOCAL   s_dcl, skip_dcl, s_dcl_end\n" +
                    "    pusha\n" +
                    "    mov dx, cs\n" +
                    "    mov es, dx\n" +
                    "    mov ah, 13h\n" +
                    "    mov al, 1\n" +
                    "    mov bh, 0\n" +
                    "    mov bl, attrib\n" +
                    "    mov cx, offset s_dcl_end - offset s_dcl\n" +
                    "    mov dl, x\n" +
                    "    mov dh, y\n" +
                    "    mov bp, offset s_dcl\n" +
                    "    int 10h\n" +
                    "    popa\n" +
                    "    jmp skip_dcl\n" +
                    "    s_dcl DB sdat\n" +
                    "    s_dcl_end DB 0\n" +
                    "    skip_dcl:    \n" +
                    "endm\n" +
                    "\n" +
                    "clear_screen macro\n" +
                    "    pusha\n" +
                    "    mov ax, 0600h\n" +
                    "    mov bh, 0000_1111b\n" +
                    "    mov cx, 0\n" +
                    "    mov dh, 24\n" +
                    "    mov dl, 79\n" +
                    "    int 10h\n" +
                    "    popa\n" +
                    "endm\n" +
                    "\n" +
                    "print_space macro num\n" +
                    "    pusha\n" +
                    "    mov ah, 9\n" +
                    "    mov al, ' '\n" +
                    "    mov bl, 0000_1111b\n" +
                    "    mov cx, num\n" +
                    "    int 10h\n" +
                    "    popa\n" +
                    "endm\n" +
                    "\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "curX dw 0\n" +
                    "curY dw 0\n" +
                    "curB dw 0\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "mov ax, 1003h ; disable blinking.  \n" +
                    "mov bx, 0        \n" +
                    "int 10h\n" +
                    "\n" +
                    "; hide text cursor:\n" +
                    "mov ch, 32\n" +
                    "mov ah, 1\n" +
                    "int 10h\n" +
                    "\n" +
                    "\n" +
                    "; reset mouse and get its status:\n" +
                    "mov ax, 0\n" +
                    "int 33h\n" +
                    "cmp ax, 0\n" +
                    "jne ok\n" +
                    "print 1,1,0010_1111b, \" mouse not found :-( \"\n" +
                    "jmp stop\n" +
                    "\n" +
                    "ok:\n" +
                    "clear_screen\n" +
                    "\n" +
                    "print 7,7,0010_1011b,\" note: in the emulator you may need to press and hold mouse buttons \"\n" +
                    "print 7,8,0010_1011b,\" because mouse interrupts are not processed in real time.           \"\n" +
                    "print 7,9,0010_1011b,\" for a real test, click external->run from the menu.                \"\n" +
                    "print 10,11,0010_1111b,\" click/hold both buttons to exit... \"\n" +
                    "\n" +
                    "; display mouse cursor:\n" +
                    "mov ax, 1\n" +
                    "int 33h\n" +
                    "\n" +
                    "check_mouse_buttons:\n" +
                    "mov ax, 3\n" +
                    "int 33h\n" +
                    "cmp bx, 3  ; both buttons\n" +
                    "je  hide\n" +
                    "cmp cx, curX\n" +
                    "jne print_xy\n" +
                    "cmp dx, curY\n" +
                    "jne print_xy\n" +
                    "cmp bx, curB\n" +
                    "jne print_buttons\n" +
                    "\n" +
                    "\n" +
                    "print_xy:\n" +
                    "print 0,0,0000_1111b,\"x=\"\n" +
                    "mov ax, cx\n" +
                    "call print_ax\n" +
                    "print_space 4\n" +
                    "print 0,1,0000_1111b,\"y=\"\n" +
                    "mov ax, dx\n" +
                    "call print_ax\n" +
                    "print_space 4\n" +
                    "mov curX, cx\n" +
                    "mov curY, dx\n" +
                    "jmp check_mouse_buttons\n" +
                    "\n" +
                    "print_buttons:\n" +
                    "print 0,2,0000_1111b,\"btn=\"\n" +
                    "mov ax, bx\n" +
                    "call print_ax\n" +
                    "print_space 4\n" +
                    "mov curB, bx\n" +
                    "jmp check_mouse_buttons\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "hide:\n" +
                    "mov ax, 2  ; hide mouse cursor.\n" +
                    "int 33h\n" +
                    "\n" +
                    "clear_screen\n" +
                    "\n" +
                    "print 1,1,1010_0000b,\" hardware must be free!      free the mice! \"\n" +
                    "\n" +
                    "stop:\n" +
                    "; show box-shaped blinking text cursor:\n" +
                    "mov ah, 1\n" +
                    "mov ch, 0\n" +
                    "mov cl, 8\n" +
                    "int 10h\n" +
                    "\n" +
                    "print 4,7,0000_1010b,\" press any key.... \"\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "print_ax proc\n" +
                    "cmp ax, 0\n" +
                    "jne print_ax_r\n" +
                    "    push ax\n" +
                    "    mov al, '0'\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h\n" +
                    "    pop ax\n" +
                    "    ret \n" +
                    "print_ax_r:\n" +
                    "    pusha\n" +
                    "    mov dx, 0\n" +
                    "    cmp ax, 0\n" +
                    "    je pn_done\n" +
                    "    mov bx, 10\n" +
                    "    div bx    \n" +
                    "    call print_ax_r\n" +
                    "    mov ax, dx\n" +
                    "    add al, 30h\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h    \n" +
                    "    jmp pn_done\n" +
                    "pn_done:\n" +
                    "    popa  \n" +
                    "    ret  \n" +
                    "endp\n",





            "; mouse drawing.\n" +
                    "; press left mouse button to draw.\n" +
                    "\n" +
                    "; for a real test click external->run from the emulator's menu.\n" +
                    "\n" +
                    "name \"mouse2\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "oldX dw -1\n" +
                    "oldY dw 0\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "mov ah, 00\n" +
                    "mov al, 13h       ; set screen to 256 colors, 320x200 pixels. \n" +
                    "int 10h\n" +
                    "\n" +
                    "; reset mouse and get its status:\n" +
                    "mov ax, 0\n" +
                    "int 33h\n" +
                    "cmp ax, 0\n" +
                    "; display mouse cursor:\n" +
                    ";mov ax, 1\n" +
                    ";int 33h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "check_mouse_button:\n" +
                    "mov ax, 3\n" +
                    "int 33h\n" +
                    "shr cx, 1       ; x/2 - in this mode the value of CX is doubled.\n" +
                    "cmp bx, 1\n" +
                    "jne xor_cursor:\n" +
                    "mov al, 1010b   ; pixel color\n" +
                    "jmp draw_pixel\n" +
                    "xor_cursor:\n" +
                    "cmp oldX, -1\n" +
                    "je not_required\n" +
                    "push cx\n" +
                    "push dx\n" +
                    "mov cx, oldX\n" +
                    "mov dx, oldY\n" +
                    "mov ah, 0dh     ; get pixel.\n" +
                    "int 10h\n" +
                    "xor al, 1111b   ; pixel color\n" +
                    "mov ah, 0ch     ; set pixel\n" +
                    "int 10h\n" +
                    "pop dx\n" +
                    "pop cx\n" +
                    "not_required:\n" +
                    "mov ah, 0dh     ; get pixel.\n" +
                    "int 10h\n" +
                    "xor al, 1111b   ; pixel color\n" +
                    "mov oldX, cx\n" +
                    "mov oldY, dx\n" +
                    "draw_pixel:\n" +
                    "mov ah, 0ch     ; set pixel\n" +
                    "int 10h\n" +
                    "check_esc_key:\n" +
                    "mov dl, 255\n" +
                    "mov ah, 6\n" +
                    "int 21h\n" +
                    "cmp al, 27      ; esc?\n" +
                    "jne check_mouse_button\n" +
                    "\n" +
                    "\n" +
                    "stop:\n" +
                    ";mov ax, 2  ; hide mouse cursor.\n" +
                    ";int 33h\n" +
                    "mov ax, 3 ; back to text mode: 80x25\n" +
                    "int 10h\n" +
                    "; show box-shaped blinking text cursor:\n" +
                    "mov ah, 1\n" +
                    "mov ch, 0\n" +
                    "mov cl, 8\n" +
                    "int 10h\n" +
                    "mov dx, offset msg\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "ret\n" +
                    "\n" +
                    "msg db \" press any key....     $\"\n" +
                    "\n",





            "; this sample checks if string is a palindrome or not.\n" +
                    "; palindrome is a text that can be read backwards\n" +
                    "; and give the same meaning as if it was read forward.\n" +
                    "; for example: \"abba\" is polindrome.\n" +
                    "; note: this program is case sensitive, \"abba\" is not \"abba\".\n" +
                    "\n" +
                    "name \"pali\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "m1:\n" +
                    "s db 'able was ere ere saw elba'\n" +
                    "s_size = $ - m1\n" +
                    "  db 0Dh,0Ah,'$'\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; first let's print it:\n" +
                    "mov ah, 9\n" +
                    "mov dx, offset s\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "lea di, s\n" +
                    "mov si, di\n" +
                    "add si, s_size\n" +
                    "dec si  ; point to last char!\n" +
                    "\n" +
                    "mov cx, s_size\n" +
                    "cmp cx, 1\n" +
                    "je is_palindrome  ; single char is always palindrome!\n" +
                    "\n" +
                    "shr cx, 1     ; divide by 2!\n" +
                    "\n" +
                    "next_char:\n" +
                    "    mov al, [di]\n" +
                    "    mov bl, [si]\n" +
                    "    cmp al, bl\n" +
                    "    jne not_palindrome\n" +
                    "    inc di\n" +
                    "    dec si\n" +
                    "loop next_char\n" +
                    "\n" +
                    "\n" +
                    "is_palindrome:  \n" +
                    "   ;  the string is \"palindrome!\"\n" +
                    "   mov ah, 9\n" +
                    "   mov dx, offset msg1\n" +
                    "   int 21h\n" +
                    "jmp stop\n" +
                    "\n" +
                    "not_palindrome:\n" +
                    "   ;  the string is \"not palindrome!\"\n" +
                    "   mov ah, 9\n" +
                    "   mov dx, offset msg2\n" +
                    "   int 21h\n" +
                    "stop:\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "msg1 db \"  this is palindrome!$\"\n" +
                    "msg2 db \"  this is not a palindrome!$\"\n",







            "; a short program to check how\n" +
                    "; set and get pixel color works\n" +
                    "\n" +
                    "name \"pixel\"\n" +
                    "\n" +
                    "org  100h\n" +
                    "\n" +
                    "mov ah, 0   ; set display mode function.\n" +
                    "mov al, 13h ; mode 13h = 320x200 pixels, 256 colors.\n" +
                    "int 10h     ; set it!\n" +
                    "\n" +
                    "mov cx, 10  ; column\n" +
                    "mov dx, 20  ; row\n" +
                    "mov al, 15  ; white\n" +
                    "mov ah, 0ch ; put pixel\n" +
                    "int 10h\n" +
                    "\n" +
                    "xor al, al  ; al = 0\n" +
                    "\n" +
                    "mov cx, 10  ; column\n" +
                    "mov dx, 20  ; row\n" +
                    "mov ah, 0dh ; get pixel\n" +
                    "int 10h\n" +
                    "\n" +
                    "; pause the screen for dos compatibility:\n" +
                    "\n" +
                    ";wait for keypress\n" +
                    "  mov ah,00\n" +
                    "  int 16h\t\t\t\n" +
                    "\n" +
                    "; return to text mode:\n" +
                    "  mov ah,00 ; set display mode function.\n" +
                    "  mov al,03 ; normal text mode 3\n" +
                    "  int 10h   ; set it!\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n",





            "; this example shows how to print string.\n" +
                    "; the string is defined just after the call instruction.\n" +
                    "; this example does not use emu8086.inc library.\n" +
                    "\n" +
                    "name \"print\"\n" +
                    "\n" +
                    "org    100h\n" +
                    "\n" +
                    "; set these values to registers for no particular reason,\n" +
                    "; we just want to check that the procedure does not destroy them.\n" +
                    "mov si, 1234h\n" +
                    "mov ax, 9876h\n" +
                    "\n" +
                    "; 0Dh,0Ah - is the code\n" +
                    ";          for standard new\n" +
                    ";          line characters:\n" +
                    ";   0Dh - carriage return.\n" +
                    ";   0Ah - new line.\n" +
                    "\n" +
                    "call printme\n" +
                    "db 'hello', 0\n" +
                    "\n" +
                    "; gets here after print:\n" +
                    "mov    cx, 1    \n" +
                    "\n" +
                    "call   printme\n" +
                    "db ' world!', 0Dh,0Ah, 0\n" +
                    "\n" +
                    "; gets here after print:\n" +
                    "mov    cx, 2\n" +
                    "\n" +
                    "call   printme\n" +
                    "       db 'hi there!', 0Ah\n" +
                    "       db \"what's up?\", 0Dh,0Ah\n" +
                    "       db 'printing!', 0\n" +
                    "\n" +
                    "; printme returns here:\n" +
                    "xor    cx, cx\n" +
                    "\n" +
                    "call   printme\n" +
                    "       db 0xd,0xa,\"press any key...\", 0\n" +
                    "\n" +
                    "\n" +
                    "; wat for any key....\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret    ; return to os.\n" +
                    "\n" +
                    ";*******************************\n" +
                    "; this procedure prints a null terminated\n" +
                    "; string at current cursor position.\n" +
                    "; the zero terminated string should\n" +
                    "; be defined just after\n" +
                    "; the call. for example:\n" +
                    ";\n" +
                    "; call printme\n" +
                    "; db 'hello world!', 0\n" +
                    ";\n" +
                    "; address of string is stored in the\n" +
                    "; stack as return address.\n" +
                    "; procedure updates value in the\n" +
                    "; stack to make return\n" +
                    "; after string definition.\n" +
                    "\n" +
                    "printme:\n" +
                    "\n" +
                    "mov     cs:temp1, si  ; protect si register.\n" +
                    "\n" +
                    "pop     si            ; get return address (ip).\n" +
                    "\n" +
                    "push    ax            ; store ax register.\n" +
                    "\n" +
                    "next_char:      \n" +
                    "        mov     al, cs:[si]\n" +
                    "        inc     si            ; next byte.\n" +
                    "        cmp     al, 0\n" +
                    "        jz      printed        \n" +
                    "        mov     ah, 0eh       ; teletype function.\n" +
                    "        int     10h\n" +
                    "        jmp     next_char     ; loop.\n" +
                    "printed:\n" +
                    "\n" +
                    "pop     ax            ; re-store ax register.\n" +
                    "\n" +
                    "; si should point to next command after\n" +
                    "; the call instruction and string definition:\n" +
                    "push    si            ; save new return address into the stack.\n" +
                    "\n" +
                    "mov     si, cs:temp1  ; re-store si register.\n" +
                    "\n" +
                    "ret\n" +
                    "; variable to store original\n" +
                    "; value of si register.\n" +
                    "temp1  dw  ?    \n" +
                    ";*******************************\n",






            "; The recursive function to print decimal UNsigned value of AL register.\n" +
                    "; And simpler function to print out binary value of AL register.\n" +
                    "\n" +
                    "name \"printAL\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "mov al, 254\n" +
                    "call print_al       ; unsigned decimal.\n" +
                    "call print_nl       ; new line.\n" +
                    "call print_al_bin   ; binary (8 bits).\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "print_al proc\n" +
                    "cmp al, 0\n" +
                    "jne print_al_r\n" +
                    "    push ax\n" +
                    "    mov al, '0'\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h\n" +
                    "    pop ax\n" +
                    "    ret \n" +
                    "print_al_r:    \n" +
                    "    pusha\n" +
                    "    mov ah, 0\n" +
                    "    cmp ax, 0\n" +
                    "    je pn_done\n" +
                    "    mov dl, 10\n" +
                    "    div dl    \n" +
                    "    call print_al_r\n" +
                    "    mov al, ah\n" +
                    "    add al, 30h\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h    \n" +
                    "    jmp pn_done\n" +
                    "pn_done:\n" +
                    "    popa  \n" +
                    "    ret  \n" +
                    "endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; procedure prints the binary value of AL\n" +
                    "print_al_bin proc\n" +
                    "    pusha\n" +
                    "    ; print result in binary:\n" +
                    "    mov cx, 8  \n" +
                    "    mov bl, al\n" +
                    "    p1:    mov ah, 2   ; print function.\n" +
                    "           mov dl, '0'\n" +
                    "           test bl, 10000000b  ; test first bit.\n" +
                    "           jz zero\n" +
                    "           mov dl, '1'\n" +
                    "    zero:  int 21h\n" +
                    "           shl bl, 1\n" +
                    "    loop p1\n" +
                    "    ; print binary suffix:\n" +
                    "    mov dl, 'b'\n" +
                    "    int 21h\n" +
                    "    ; print carrige return and new line:\n" +
                    "    mov dl, 0Dh\n" +
                    "    int 21h\n" +
                    "    mov dl, 0Ah\n" +
                    "    int 21h\n" +
                    "    popa\n" +
                    "    ret  ; return to the main program.\n" +
                    "endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "print_nl proc \n" +
                    "    push ax  \n" +
                    "    push dx  \n" +
                    "    mov ah, 2\n" +
                    "    mov dl, 0Dh\n" +
                    "    int 21h  \n" +
                    "    mov dl, 0Ah\n" +
                    "    int 21h   \n" +
                    "    pop dx \n" +
                    "    pop ax      \n" +
                    "    ret\n" +
                    "endp         ",





            "; The recursive function to print UNsigned value of AX register.\n" +
                    "; And simpler function to print out binary value of the AX register.\n" +
                    "\n" +
                    "name \"printAX\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "mov ax, 12345  \n" +
                    "call print_ax     ; unsigned decimal.\n" +
                    "call print_nl     ; new line. \n" +
                    "call print_ax_bin ; binary (16 bit).\n" +
                    "    \n" +
                    "\n" +
                    "; wait for any key...\n" +
                    "mov ah, 1\n" +
                    "int 21h    \n" +
                    "    \n" +
                    "    \n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "   \n" +
                    "print_ax proc\n" +
                    "cmp ax, 0\n" +
                    "jne print_ax_r\n" +
                    "    push ax\n" +
                    "    mov al, '0'\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h\n" +
                    "    pop ax\n" +
                    "    ret \n" +
                    "print_ax_r:\n" +
                    "    pusha\n" +
                    "    mov dx, 0\n" +
                    "    cmp ax, 0\n" +
                    "    je pn_done\n" +
                    "    mov bx, 10\n" +
                    "    div bx    \n" +
                    "    call print_ax_r\n" +
                    "    mov ax, dx\n" +
                    "    add al, 30h\n" +
                    "    mov ah, 0eh\n" +
                    "    int 10h    \n" +
                    "    jmp pn_done\n" +
                    "pn_done:\n" +
                    "    popa  \n" +
                    "    ret  \n" +
                    "endp\n" +
                    "\n" +
                    "\n" +
                    "print_ax_bin proc  \n" +
                    "    pusha\n" +
                    "    ; print result value in binary:\n" +
                    "    mov cx, 16\n" +
                    "    mov bx, ax\n" +
                    "    print: mov ah, 2   ; print function.\n" +
                    "           mov dl, '0'\n" +
                    "           test bx, 1000000000000000b  ; test first bit.\n" +
                    "           jz zero\n" +
                    "           mov dl, '1'\n" +
                    "    zero:  int 21h\n" +
                    "           shl bx, 1\n" +
                    "    loop print      \n" +
                    "    ; print binary suffix:\n" +
                    "    mov dl, 'b'\n" +
                    "    int 21h  \n" +
                    "    popa  \n" +
                    "    ret\n" +
                    "endp      \n" +
                    "\n" +
                    "        \n" +
                    "        \n" +
                    "print_nl proc \n" +
                    "    push ax  \n" +
                    "    push dx  \n" +
                    "    mov ah, 2\n" +
                    "    mov dl, 0Dh\n" +
                    "    int 21h  \n" +
                    "    mov dl, 0Ah\n" +
                    "    int 21h   \n" +
                    "    pop dx \n" +
                    "    pop ax      \n" +
                    "    ret\n" +
                    "endp",





            "\n" +
                    "name \"charchar\"\n" +
                    "\n" +
                    "\n" +
                    "org  100h\n" +
                    "\n" +
                    "\n" +
                    "print_new_line macro\n" +
                    "    mov dl, 13\n" +
                    "    mov ah, 2\n" +
                    "    int 21h   \n" +
                    "    mov dl, 10\n" +
                    "    mov ah, 2\n" +
                    "    int 21h      \n" +
                    "endm\n" +
                    "\n" +
                    "\n" +
                    "    mov dx, offset msg1\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "    ; input the string:\n" +
                    "    mov dx, offset s1\n" +
                    "    mov ah, 0ah\n" +
                    "    int 21h\n" +
                    "    \n" +
                    "    ; get actual string size:\n" +
                    "    xor cx, cx\n" +
                    "    mov cl, s1[1]\n" +
                    "    print_new_line\n" +
                    "                  \n" +
                    "    mov bx, offset s1[2]\n" +
                    "print_char:\n" +
                    "    mov dl, [bx]\n" +
                    "    mov ah, 2\n" +
                    "    int 21h      \n" +
                    "    print_new_line   \n" +
                    "    inc bx\n" +
                    "    loop print_char\n" +
                    "\n" +
                    "\n" +
                    "    ; wait for any key...\n" +
                    "    mov ax, 0 \n" +
                    "    int 16h\n" +
                    "    \n" +
                    "    ret\n" +
                    "\n" +
                    "\n" +
                    "msg1    db  \"ENTER THE STRING: $\"\n" +
                    "s1      db 100,?, 100 dup(' ') \n" +
                    "\n" +
                    "\n" +
                    "end\n",





            "; this sample prints out a hex value of DL register.\n" +
                    "\n" +
                    "name \"digit\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "mov dl, 7ch\n" +
                    "\n" +
                    "; load address of data table in bx, for xlat instruction:\n" +
                    "lea bx, table  \n" +
                    "\n" +
                    "; xlat does the following:\n" +
                    "; al = ds:[bx + unsigned al]\n" +
                    "\n" +
                    "mov al, dl\n" +
                    "shr al, 4    ; leave high part only.\n" +
                    "xlat         ; get hex digit. \n" +
                    "mov ah, 0eh  ; teletype sub-function.\n" +
                    "int 10h\n" +
                    "\n" +
                    "\n" +
                    "mov al, dl\n" +
                    "and al, 0fh  ; leave low part only.\n" +
                    "xlat         ; get hex digit.     \n" +
                    "mov ah, 0eh  ; teletype sub-function.\n" +
                    "int 10h\n" +
                    "\n" +
                    "; wait for any key press:\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "table db '0123456789abcdef'\n",





            "; the printer demonstration.\n" +
                    "\n" +
                    "; this is simplified/ms-dos complatible version.\n" +
                    "\n" +
                    "; this example may not work on Windows XP, however it may work for Windows 95/98:\n" +
                    "; http://support.microsoft.com/default.aspx?scid=kb;en-us;Q258878\n" +
                    "\n" +
                    "; the printer device is created by Andrew Nelis.\n" +
                    "\n" +
                    "; the original example that uses i/o ports that are unique to the emulator is located here:\n" +
                    "; c:\\emu8086\\DEVICES\\DEVELOPER\\sources\\Printer_emulation_demo.asm\n" +
                    "\n" +
                    "\n" +
                    "name \"printer\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "msg db \"Hello, Printer!\", 0Ah, 0Dh\n" +
                    "    db \"***************\"\n" +
                    "    db 13, 9    ; carriage return and vertical tab\n" +
                    "    db \"Have a nice printing day!\"\n" +
                    "    \n" +
                    "msg_end db 0\n" +
                    "msg2 db \"press any key to eject the page.$\"\n" +
                    "\n" +
                    "start:\n" +
                    "    mov dl, 12      ; form feed code. new page.\n" +
                    "    mov ah, 5\n" +
                    "    int 21h\n" +
                    "\n" +
                    "\n" +
                    "    mov si, offset msg\n" +
                    "    mov cx, offset msg_end - offset msg\n" +
                    "print:\n" +
                    "    mov dl, [si]\n" +
                    "    mov ah, 5       ; MS-DOS print function.\n" +
                    "    int 21h\n" +
                    "    inc si\t        ; next char.\n" +
                    "    loop print\n" +
                    "   \n" +
                    "    mov dx, offset msg2\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "   \n" +
                    "    mov ax, 0       ; wait for any key...\n" +
                    "    int 16h\n" +
                    "\n" +
                    "    mov dl, 12      ; form feed code. page out!\n" +
                    "    mov ah, 5\n" +
                    "    int 21h\n" +
                    "    \n" +
                    "ret\n" +
                    "\n",





            "; reverse string\n" +
                    "\n" +
                    "name \"reverse\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "; when reversed it will be a readable string,\n" +
                    "; '$' marks the end of the string:\n" +
                    "string1 db '!gnirts a si siht$'  \n" +
                    "\n" +
                    "start:      lea bx, string1\n" +
                    "\n" +
                    "            mov si, bx\n" +
                    "\n" +
                    "next_byte:  cmp [si], '$'\n" +
                    "            je found_the_end\n" +
                    "            inc si\n" +
                    "            jmp next_byte\n" +
                    "\n" +
                    "found_the_end:  dec si\n" +
                    "\n" +
                    "; now bx points to beginning,\n" +
                    "; and si points to the end of string.\n" +
                    "\n" +
                    "\n" +
                    "; do the swapping:\n" +
                    "\n" +
                    "do_reverse: cmp bx, si\n" +
                    "            jae done\n" +
                    "            \n" +
                    "            mov al, [bx]\n" +
                    "            mov ah, [si]\n" +
                    "            \n" +
                    "            mov [si], al\n" +
                    "            mov [bx], ah\n" +
                    "            \n" +
                    "            inc bx\n" +
                    "            dec si\n" +
                    "jmp do_reverse\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; reverse complete, print out:\n" +
                    "done:       lea dx, string1\n" +
                    "            mov ah, 09h\n" +
                    "            int 21h\n" +
                    "\n" +
                    "; wait for any key press....\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "ret\n",





            "\n" +
                    "#start=robot.exe#\n" +
                    "\n" +
                    "name \"robot\"\n" +
                    "\n" +
                    "#make_bin#\n" +
                    "#cs = 500#\n" +
                    "#ds = 500#\n" +
                    "#ss = 500#    ; stack\n" +
                    "#sp = ffff#\n" +
                    "#ip = 0#\n" +
                    "\n" +
                    "; this is an example of contoling the robot.\n" +
                    "\n" +
                    "; this code randomly moves the robot,\n" +
                    "; and makes it to switch the lamps on and off.\n" +
                    "\n" +
                    "; robot is a mechanical creature and it takes \n" +
                    "; some time for it to complete a task.\n" +
                    "; status register is used to see if robot is busy or not.\n" +
                    "\n" +
                    "; c:\\emu8086\\devices\\robot.exe uses ports 9, 10 and 11\n" +
                    "; source code of the robot and other devices is in:\n" +
                    "; c:\\emu8086\\devices\\developer\\sources\\\n" +
                    "; robot is programmed in visual basic 6.0\n" +
                    "\n" +
                    "\n" +
                    "; robot base i/o port:\n" +
                    "r_port equ 9\n" +
                    "\n" +
                    ";===================================\n" +
                    "\n" +
                    "eternal_loop:\n" +
                    "; wait until robot\n" +
                    "; is ready:\n" +
                    "call wait_robot\n" +
                    "\n" +
                    "; examine the area\n" +
                    "; in front of the robot:\n" +
                    "mov al, 4\n" +
                    "out r_port, al\n" +
                    "\n" +
                    "call wait_exam\n" +
                    "\n" +
                    "; get result from\n" +
                    "; data register:\n" +
                    "in al, r_port + 1\n" +
                    "\n" +
                    "; nothing found?\n" +
                    "cmp al, 0\n" +
                    "je cont  ; - yes, so continue.\n" +
                    "\n" +
                    "; wall?\n" +
                    "cmp al, 255  \n" +
                    "je cont  ; - yes, so continue.\n" +
                    "\n" +
                    "; switched-on lamp?\n" +
                    "cmp al, 7\n" +
                    "jne lamp_off  ; - no, so skip.\n" +
                    "; - yes, so switch it off,\n" +
                    ";   and turn:\n" +
                    "call switch_off_lamp \n" +
                    "jmp  cont  ; continue\n" +
                    "\n" +
                    "lamp_off: nop\n" +
                    "\n" +
                    "; if gets here, then we have\n" +
                    "; switched-off lamp, because\n" +
                    "; all other situations checked\n" +
                    "; already:\n" +
                    "call switch_on_lamp\n" +
                    "\n" +
                    "cont:\n" +
                    "call random_turn\n" +
                    "\n" +
                    "call wait_robot\n" +
                    "\n" +
                    "; try to step forward:\n" +
                    "mov al, 1\n" +
                    "out r_port, al\n" +
                    "\n" +
                    "call wait_robot\n" +
                    "\n" +
                    "; try to step forward again:\n" +
                    "mov al, 1\n" +
                    "out r_port, al\n" +
                    "\n" +
                    "jmp eternal_loop ; go again!\n" +
                    "\n" +
                    ";===================================\n" +
                    "\n" +
                    "; this procedure does not\n" +
                    "; return until robot is ready\n" +
                    "; to receive next command:\n" +
                    "wait_robot proc\n" +
                    "; check if robot busy:\n" +
                    "busy: in al, r_port+2\n" +
                    "      test al, 00000010b\n" +
                    "      jnz busy ; busy, so wait.\n" +
                    "ret    \n" +
                    "wait_robot endp\n" +
                    "\n" +
                    ";===================================\n" +
                    "\n" +
                    "; this procedure does not\n" +
                    "; return until robot completes\n" +
                    "; the examination:\n" +
                    "wait_exam proc\n" +
                    "; check if has new data:\n" +
                    "busy2: in al, r_port+2\n" +
                    "       test al, 00000001b\n" +
                    "       jz busy2 ; no new data, so wait.\n" +
                    "ret    \n" +
                    "wait_exam endp\n" +
                    "\n" +
                    ";===================================\n" +
                    "\n" +
                    "; switch off the lamp:\n" +
                    "switch_off_lamp proc\n" +
                    "mov al, 6\n" +
                    "out r_port, al\n" +
                    "ret\n" +
                    "switch_off_lamp endp\n" +
                    "\n" +
                    ";===================================\n" +
                    "\n" +
                    "; switch on the lamp:\n" +
                    "switch_on_lamp proc\n" +
                    "mov al, 5\n" +
                    "out r_port, al\n" +
                    "ret\n" +
                    "switch_on_lamp endp\n" +
                    "\n" +
                    ";===================================\n" +
                    "\n" +
                    "; generates a random turn using\n" +
                    "; system timer:\n" +
                    "random_turn proc\n" +
                    "\n" +
                    "; get number of clock\n" +
                    "; ticks since midnight\n" +
                    "; in cx:dx\n" +
                    "mov ah, 0\n" +
                    "int 1ah\n" +
                    "\n" +
                    "; randomize using xor:\n" +
                    "xor dh, dl\n" +
                    "xor ch, cl\n" +
                    "xor ch, dh\n" +
                    "\n" +
                    "test ch, 2\n" +
                    "jz no_turn\n" +
                    "\n" +
                    "test ch, 1\n" +
                    "jnz turn_right\n" +
                    "\n" +
                    "; turn left:\n" +
                    "mov al, 2\n" +
                    "out r_port, al\n" +
                    "; exit from procedure:\n" +
                    "ret  \n" +
                    "\n" +
                    "turn_right:\n" +
                    "mov al, 3\n" +
                    "out r_port, al\n" +
                    "\n" +
                    "no_turn:\n" +
                    "ret\n" +
                    "random_turn endp\n" +
                    "\n" +
                    ";===================================\n",




            "; this sample shows how to use scasb instruction to find a symbol.\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "\n" +
                    "str1 db 'aaabbbxddd'\n" +
                    "s_found db '\"yes\" - found!', 0Dh,0Ah, '$'\n" +
                    "s_not   db '\"no\" - not found!', 0Dh,0Ah, '$'\n" +
                    "find_what equ 'x'\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "; set forward direction:\n" +
                    "    cld\n" +
                    "\n" +
                    "; set counter to string size:\n" +
                    "    mov cx, 10\n" +
                    "\n" +
                    "; load string address into es:di\n" +
                    "    mov ax, cs\n" +
                    "    mov es, ax\n" +
                    "    lea di, str1\n" +
                    "\n" +
                    "; we will look for the character in string:\n" +
                    "    mov al, find_what\n" +
                    "\n" +
                    "    repne   scasb\n" +
                    "\n" +
                    "    jz  found\n" +
                    "\n" +
                    "not_found:\n" +
                    "\n" +
                    "; \"no\" - not found!\n" +
                    "    mov dx, offset s_not\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "\n" +
                    "    jmp exit_here\n" +
                    "found:\n" +
                    "\n" +
                    "; \"yes\" - found!\n" +
                    "    mov dx, offset s_found\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "\n" +
                    "; di contains the address of searched character:\n" +
                    "    dec di  \n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press...\n" +
                    "    mov ah, 0\n" +
                    "    int 16h\n" +
                    "    \n" +
                    "exit_here:\n" +
                    "    ret\n",



            "; this sample shows how to use scasw instruction to find a word (2 bytes).\n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "dat1 dw 1234h, 5678h, 9075h, 3456h\n" +
                    "find_what equ 9075h\n" +
                    "s_found db '\"yes\" - found!', 0Dh,0Ah, '$'\n" +
                    "s_not   db '\"no\" - not found!', 0Dh,0Ah, '$'\n" +
                    "\n" +
                    "start:\n" +
                    "; set forward direction:\n" +
                    "    cld\n" +
                    "\n" +
                    "; set counter to data size:\n" +
                    "    mov cx, 4\n" +
                    "\n" +
                    "; load string address into es:di\n" +
                    "    mov ax, cs\n" +
                    "    mov es, ax\n" +
                    "    lea di, dat1\n" +
                    "\n" +
                    "; we will look for the word in data string:\n" +
                    "    mov ax, find_what\n" +
                    "\n" +
                    "    repne   scasw\n" +
                    "\n" +
                    "    jz  found\n" +
                    "\n" +
                    "not_found:\n" +
                    "\n" +
                    "; \"no\" - not found!\n" +
                    "    mov dx, offset s_not\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "\n" +
                    "    jmp exit_here\n" +
                    "found:\n" +
                    "\n" +
                    "; \"yes\" - found!\n" +
                    "    mov dx, offset s_found\n" +
                    "    mov ah, 9\n" +
                    "    int 21h\n" +
                    "\n" +
                    "; di contains the address of searched word:\n" +
                    "    dec di  \n" +
                    "\n" +
                    "; wait for any key press...\n" +
                    "    mov ah, 0\n" +
                    "    int 16h\n" +
                    "    \n" +
                    "\n" +
                    "exit_here:\n" +
                    "    ret  ; return control to operating system...\n" +
                    "\n",





            "; this example shows how to use the bios scrolling functions.\n" +
                    "; this program prints some test strings, \n" +
                    "; then it scrolls the window at (1,1)-(8,5) down,\n" +
                    "; and scrolls the window at (1,1)-(8,5) up, back to where it was. \n" +
                    "; two lines are scrolled away and window (1,4)-(8,5) becomes blank.\n" +
                    "\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "; set data segment to code segment,\n" +
                    "; (if not set already):\n" +
                    "push    cs\n" +
                    "pop     ds\n" +
                    "\n" +
                    "; set cursor position to top\n" +
                    "mov     ah, 2\n" +
                    "mov     dh, 0 ; row.\n" +
                    "mov     dl, 0 ; column.\n" +
                    "mov     bh, 0 ; page number.\n" +
                    "int 10h\n" +
                    "\n" +
                    "\n" +
                    "; print out the test strings:\n" +
                    "lea     dx, msg0\n" +
                    "mov     ah, 9\n" +
                    "int     21h\n" +
                    "\n" +
                    "; print \"press any key to scroll up...\":\n" +
                    "lea     dx, msg1\n" +
                    "mov     ah, 9\n" +
                    "int     21h\n" +
                    "\n" +
                    "; wait for any key:\n" +
                    "xor     ax, ax\n" +
                    "int     16h\n" +
                    "\n" +
                    "; scroll window down:\n" +
                    "mov     ah, 07h ; scroll down function id.\n" +
                    "mov     al, 2   ; lines to scroll.\n" +
                    "mov     bh, 07  ; attribute for new lines.\n" +
                    "mov     cl, 1   ; upper col.\n" +
                    "mov     ch, 1   ; upper row.\n" +
                    "mov     dl, 8   ; lower col.\n" +
                    "mov     dh, 5   ; lower row.\n" +
                    "int     10h\n" +
                    "\n" +
                    "; print \"press any key to scroll down...\":\n" +
                    "lea     dx, msg2\n" +
                    "mov     ah, 9\n" +
                    "int     21h\n" +
                    "\n" +
                    "; wait for any key:\n" +
                    "xor     ax, ax\n" +
                    "int     16h\n" +
                    "\n" +
                    "; scroll window up:\n" +
                    "mov     ah, 06h ; scroll up function id.\n" +
                    "mov     al, 2   ; lines to scroll.\n" +
                    "mov     bh, 07  ; attribute for new lines.\n" +
                    "mov     cl, 1   ; upper col.\n" +
                    "mov     ch, 1   ; upper row.\n" +
                    "mov     dl, 8   ; lower col.\n" +
                    "mov     dh, 5   ; lower row.\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "; print \"that's it, press any key...\":\n" +
                    "lea     dx, msg3\n" +
                    "mov     ah, 9\n" +
                    "int     21h\n" +
                    "\n" +
                    "; wait for any key:\n" +
                    "xor     ax, ax\n" +
                    "int     16h\n" +
                    "\n" +
                    "ret     ; return to operating system.\n" +
                    "\n" +
                    "; test strings:\n" +
                    "msg0 db '01234567890abcdef', 0Dh,0Ah\n" +
                    "     db '1aaaaaaaaaaaaaaaa', 0Dh,0Ah\n" +
                    "     db '2bbbbbbbbbbbbbbbb', 0Dh,0Ah\n" +
                    "     db '3cccccccccccccccc', 0Dh,0Ah\n" +
                    "     db '4dddddddddddddddd', 0Dh,0Ah\n" +
                    "     db '5eeeeeeeeeeeeeeee', 0Dh,0Ah\n" +
                    "     db '6ffffffffffffffff', 0Dh,0Ah\n" +
                    "     db '7gggggggggggggggg', 0Dh,0Ah\n" +
                    "     db '8hhhhhhhhhhhhhhhh', 0Dh,0Ah, '$'\n" +
                    "\n" +
                    "msg1 db 0Dh,0Ah, 0Ah, 'press any key to scroll window at (1,1)-(8,5) two lines down...', 0Dh,0Ah, '$'\n" +
                    "\n" +
                    "msg2 db 'press any key to scroll window at (1,1)-(8,5) two lines up...', 0Dh,0Ah, '$'\n" +
                    "\n" +
                    "msg3 db \"that's it, press any key...\", 0Dh,0Ah, '$'\n" +
                    "\n" +
                    "end\n",






            "; this sample shows how to access virtual ports (0 to 0FFFFh).\n" +
                    "; these ports are emulated in this file: c:\\emu8086.io\n" +
                    "\n" +
                    "; this new technology allows to make external add-on devices\n" +
                    "; for emu8086, such as led displays, thermostat, stepper-motor, etc...\n" +
                    "\n" +
                    "; \"devices\" folder contains sample device that works with this sample.\n" +
                    "; (with visual basic source code).\n" +
                    "\n" +
                    "#start=simple.exe#\n" +
                    "\n" +
                    "#make_bin#\n" +
                    "\n" +
                    "name \"simple\"\n" +
                    "\n" +
                    "; write byte value 0A7h into the port 110:\n" +
                    "mov al, 0A7h\n" +
                    "out 110, al\n" +
                    "\n" +
                    "; write word value 1234h into the port 112:\n" +
                    "mov ax, 1234h\n" +
                    "out 112, ax\n" +
                    "\n" +
                    "mov ax, 0 ; reset register.\n" +
                    "\n" +
                    "; read byte from port 110 into AL:\n" +
                    "in al, 110\n" +
                    "\n" +
                    "; read word from port 112 into AX:\n" +
                    "in ax, 112\n" +
                    "\n" +
                    "\n" +
                    "hlt\n" +
                    "\n" +
                    "\n",






            "; Control the snake using arrow keys.\n" +
                    ";\n" +
                    "; Any other keys stop the snake.\n" +
                    ";\n" +
                    "; Press Esc to exit.\n" +
                    "\n" +
                    "\n" +
                    "name \"snake\"\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "; jump over data section:\n" +
                    "jmp     start\n" +
                    "\n" +
                    "; ------ data section ------\n" +
                    "\n" +
                    "s_size  equ     7\n" +
                    "\n" +
                    "; the snake coordinates\n" +
                    "; (from head to tail)\n" +
                    "; low byte is left, high byte\n" +
                    "; is top - [top, left]\n" +
                    "snake dw s_size dup(0)\n" +
                    "\n" +
                    "tail    dw      ?\n" +
                    "\n" +
                    "; direction constants\n" +
                    ";          (bios key codes):\n" +
                    "left    equ     4bh\n" +
                    "right   equ     4dh\n" +
                    "up      equ     48h\n" +
                    "down    equ     50h\n" +
                    "\n" +
                    "; current snake direction:\n" +
                    "cur_dir db      right\n" +
                    "\n" +
                    "wait_time dw    0\n" +
                    "\n" +
                    "; welcome message\n" +
                    "msg \tdb \"==== How To Play ====\", 0dh,0ah\n" +
                    "\tdb \"Control the snake using arrow keys\", 0dh,0ah\t\n" +
                    "\tdb \"Any other keys stop the snake.\", 0dh,0ah, 0ah\n" +
                    "\tdb \"Press Esc to exit.\", 0dh,0ah\n" +
                    "\tdb \"====================\", 0dh,0ah, 0ah\n" +
                    "\tdb \"Press any Key to start!$\"\n" +
                    "\n" +
                    "; ------ code section ------\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "; print welcome message:\n" +
                    "mov dx, offset msg\n" +
                    "mov ah, 9 \n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key:\n" +
                    "mov ah, 00h\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "; hide text cursor:\n" +
                    "mov     ah, 1\n" +
                    "mov     ch, 2bh\n" +
                    "mov     cl, 0bh\n" +
                    "int     10h           \n" +
                    "\n" +
                    "\n" +
                    "game_loop:\n" +
                    "\n" +
                    "; === select first video page\n" +
                    "mov     al, 0  ; page number.\n" +
                    "mov     ah, 05h\n" +
                    "int     10h\n" +
                    "\n" +
                    "; === show new head:\n" +
                    "mov     dx, snake[0]\n" +
                    "\n" +
                    "; set cursor at dl,dh\n" +
                    "mov     ah, 02h\n" +
                    "int     10h\n" +
                    "\n" +
                    "; print '*' at the location:\n" +
                    "mov     al, '*'\n" +
                    "mov     ah, 09h\n" +
                    "mov     bl, 0eh ; attribute.\n" +
                    "mov     cx, 1   ; single char.\n" +
                    "int     10h\n" +
                    "\n" +
                    "; === keep the tail:\n" +
                    "mov     ax, snake[s_size * 2 - 2]\n" +
                    "mov     tail, ax\n" +
                    "\n" +
                    "call    move_snake\n" +
                    "\n" +
                    "\n" +
                    "; === hide old tail:\n" +
                    "mov     dx, tail\n" +
                    "\n" +
                    "; set cursor at dl,dh\n" +
                    "mov     ah, 02h\n" +
                    "int     10h\n" +
                    "\n" +
                    "; print ' ' at the location:\n" +
                    "mov     al, ' '\n" +
                    "mov     ah, 09h\n" +
                    "mov     bl, 0eh ; attribute.\n" +
                    "mov     cx, 1   ; single char.\n" +
                    "int     10h\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "check_for_key:\n" +
                    "\n" +
                    "; === check for player commands:\n" +
                    "mov     ah, 01h\n" +
                    "int     16h\n" +
                    "jz      no_key\n" +
                    "\n" +
                    "mov     ah, 00h\n" +
                    "int     16h\n" +
                    "\n" +
                    "cmp     al, 1bh    ; esc - key?\n" +
                    "je      stop_game  ;\n" +
                    "\n" +
                    "mov     cur_dir, ah\n" +
                    "\n" +
                    "no_key:\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; === wait a few moments here:\n" +
                    "; get number of clock ticks\n" +
                    "; (about 18 per second)\n" +
                    "; since midnight into cx:dx\n" +
                    "mov     ah, 00h\n" +
                    "int     1ah\n" +
                    "cmp     dx, wait_time\n" +
                    "jb      check_for_key\n" +
                    "add     dx, 4\n" +
                    "mov     wait_time, dx\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; === eternal game loop:\n" +
                    "jmp     game_loop\n" +
                    "\n" +
                    "\n" +
                    "stop_game:\n" +
                    "\n" +
                    "; show cursor back:\n" +
                    "mov     ah, 1\n" +
                    "mov     ch, 0bh\n" +
                    "mov     cl, 0bh\n" +
                    "int     10h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "; ------ functions section ------\n" +
                    "\n" +
                    "; this procedure creates the\n" +
                    "; animation by moving all snake\n" +
                    "; body parts one step to tail,\n" +
                    "; the old tail goes away:\n" +
                    "; [last part (tail)]-> goes away\n" +
                    "; [part i] -> [part i+1]\n" +
                    "; ....\n" +
                    "\n" +
                    "move_snake proc near\n" +
                    "\n" +
                    "; set es to bios info segment:  \n" +
                    "mov     ax, 40h\n" +
                    "mov     es, ax\n" +
                    "\n" +
                    "  ; point di to tail\n" +
                    "  mov   di, s_size * 2 - 2\n" +
                    "  ; move all body parts\n" +
                    "  ; (last one simply goes away)\n" +
                    "  mov   cx, s_size-1\n" +
                    "move_array:\n" +
                    "  mov   ax, snake[di-2]\n" +
                    "  mov   snake[di], ax\n" +
                    "  sub   di, 2\n" +
                    "  loop  move_array\n" +
                    "\n" +
                    "\n" +
                    "cmp     cur_dir, left\n" +
                    "  je    move_left\n" +
                    "cmp     cur_dir, right\n" +
                    "  je    move_right\n" +
                    "cmp     cur_dir, up\n" +
                    "  je    move_up\n" +
                    "cmp     cur_dir, down\n" +
                    "  je    move_down\n" +
                    "\n" +
                    "jmp     stop_move       ; no direction.\n" +
                    "\n" +
                    "\n" +
                    "move_left:\n" +
                    "  mov   al, b.snake[0]\n" +
                    "  dec   al\n" +
                    "  mov   b.snake[0], al\n" +
                    "  cmp   al, -1\n" +
                    "  jne   stop_move       \n" +
                    "  mov   al, es:[4ah]    ; col number.\n" +
                    "  dec   al\n" +
                    "  mov   b.snake[0], al  ; return to right.\n" +
                    "  jmp   stop_move\n" +
                    "\n" +
                    "move_right:\n" +
                    "  mov   al, b.snake[0]\n" +
                    "  inc   al\n" +
                    "  mov   b.snake[0], al\n" +
                    "  cmp   al, es:[4ah]    ; col number.   \n" +
                    "  jb    stop_move\n" +
                    "  mov   b.snake[0], 0   ; return to left.\n" +
                    "  jmp   stop_move\n" +
                    "\n" +
                    "move_up:\n" +
                    "  mov   al, b.snake[1]\n" +
                    "  dec   al\n" +
                    "  mov   b.snake[1], al\n" +
                    "  cmp   al, -1\n" +
                    "  jne   stop_move\n" +
                    "  mov   al, es:[84h]    ; row number -1.\n" +
                    "  mov   b.snake[1], al  ; return to bottom.\n" +
                    "  jmp   stop_move\n" +
                    "\n" +
                    "move_down:\n" +
                    "  mov   al, b.snake[1]\n" +
                    "  inc   al\n" +
                    "  mov   b.snake[1], al\n" +
                    "  cmp   al, es:[84h]    ; row number -1.\n" +
                    "  jbe   stop_move\n" +
                    "  mov   b.snake[1], 0   ; return to top.\n" +
                    "  jmp   stop_move\n" +
                    "\n" +
                    "stop_move:\n" +
                    "  ret\n" +
                    "move_snake endp\n" +
                    "\n" +
                    "\n",





            "name \"sort\"\n" +
                    "\n" +
                    "; simple sort\n" +
                    "          \n" +
                    "; this program inputs 3 numbers and\n" +
                    "; sorts them from largest to smallest\n" +
                    "\n" +
                    "\n" +
                    "; this macro prints a char in AL and advances\n" +
                    "; the current cursor position:\n" +
                    "putc    macro   char\n" +
                    "        push    ax\n" +
                    "        mov     al, char\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h     \n" +
                    "        pop     ax\n" +
                    "endm\n" +
                    "\n" +
                    "\n" +
                    "; this macro sets current cursor position:\n" +
                    "gotoxy  macro   col, row\n" +
                    "        push    ax\n" +
                    "        push    bx\n" +
                    "        push    dx\n" +
                    "        mov     ah, 02h\n" +
                    "        mov     dh, row\n" +
                    "        mov     dl, col\n" +
                    "        mov     bh, 0\n" +
                    "        int     10h\n" +
                    "        pop     dx\n" +
                    "        pop     bx\n" +
                    "        pop     ax\n" +
                    "endm\n" +
                    "\n" +
                    "\n" +
                    "data    segment\n" +
                    "cr        equ   0dh\n" +
                    "lf        equ   0ah\n" +
                    "dollar    equ   '$'\n" +
                    "new_line  db    lf, cr, dollar\n" +
                    "msg1      db    \"enter first value (-32768..32767)!\"\n" +
                    "          db    lf, cr, dollar\n" +
                    "msg2      db    lf, cr, \"enter second value (-32768..32767)!\"\n" +
                    "          db    lf, cr, dollar\n" +
                    "msg3      db    lf, cr, \"enter third value (-32768..32767)!\"\n" +
                    "          db    lf, cr, dollar\n" +
                    "msg4      db    cr, lf, cr, lf, \"after sorting from biggest to smallest:\", dollar\n" +
                    "msg5      db    cr, lf, \"num1 = \", dollar\n" +
                    "msg6      db    cr, lf, \"num2 = \", dollar\n" +
                    "msg7      db    cr, lf, \"num3 = \", dollar\n" +
                    "num1      dw    ?\n" +
                    "num2      dw    ?\n" +
                    "num3      dw    ?\n" +
                    "ends\n" +
                    "\n" +
                    "stack segment\n" +
                    "                dw      100h    dup(?)\n" +
                    "ends\n" +
                    "\n" +
                    "code segment\n" +
                    " start  proc    far\n" +
                    "\n" +
                    "; prepare for return to os:\n" +
                    "    push    ds\n" +
                    "    mov     ax, 0\n" +
                    "    push    ax\n" +
                    "; set segment registers:                \n" +
                    "    mov     ax, data\n" +
                    "    mov     ds, ax\n" +
                    "    mov     es, ax\n" +
                    "\n" +
                    "; clear the screen:\n" +
                    "    call    clear_screen\n" +
                    "\n" +
                    "; position the cursor at row=3 and column=0\n" +
                    "    gotoxy 0, 3\n" +
                    "\n" +
                    "\n" +
                    "; ask for first number:\n" +
                    "    lea     dx, msg1\n" +
                    "    call    puts       ; display the message.\n" +
                    "    call    scan_num   ; input the number into cx.\n" +
                    "    mov     num1, cx\n" +
                    "\n" +
                    "; ask for second number:\n" +
                    "    lea     dx, msg2\n" +
                    "    call    puts       ; display the message.\n" +
                    "    call    scan_num   ; input the number into cx.\n" +
                    "    mov     num2, cx\n" +
                    "\n" +
                    "; ask for third number:\n" +
                    "    lea     dx, msg3\n" +
                    "    call    puts       ; display the message.\n" +
                    "    call    scan_num   ; input the number into cx.\n" +
                    "    mov     num3, cx\n" +
                    "\n" +
                    "; sorting:\n" +
                    "    mov     bx, num1\n" +
                    "    mov     cx, num2\n" +
                    "    call    sort       ; exchange if bx<cx\n" +
                    "    mov     num1, bx\n" +
                    "    mov     num2, cx\n" +
                    "\n" +
                    "    mov     bx, num2\n" +
                    "    mov     cx, num3\n" +
                    "    call    sort       ; exchange if bx<cx\n" +
                    "    mov     num2, bx\n" +
                    "    mov     num3, cx\n" +
                    "\n" +
                    "    mov     bx, num1\n" +
                    "    mov     cx, num2\n" +
                    "    call    sort       ; exchange if bx<cx\n" +
                    "    mov     num1, bx\n" +
                    "    mov     num2, cx\n" +
                    "\n" +
                    "; print the result:\n" +
                    "    lea     dx, msg4\n" +
                    "    call    puts\n" +
                    "\n" +
                    "    lea     dx, msg5\n" +
                    "    call    puts\n" +
                    "    mov     ax, num1\n" +
                    "    call    print_num ; print ax.\n" +
                    "\n" +
                    "    lea     dx, msg6\n" +
                    "    call    puts\n" +
                    "    mov     ax, num2\n" +
                    "    call    print_num ; print ax.\n" +
                    "\n" +
                    "    lea     dx, msg7\n" +
                    "    call    puts\n" +
                    "    mov     ax, num3\n" +
                    "    call    print_num ; print ax.\n" +
                    "\n" +
                    "    lea     dx, new_line\n" +
                    "    call    puts\n" +
                    "    \n" +
                    "    mov     ah, 0\n" +
                    "    int     16h\n" +
                    "\n" +
                    "\n" +
                    "    retf\n" +
                    " start          endp\n" +
                    "\n" +
                    ";***********************************\n" +
                    "\n" +
                    "; displays the message (dx-address),\n" +
                    "; uses dos function to print:\n" +
                    "puts    proc    near\n" +
                    "        push    ax\n" +
                    "        mov     ah, 09h\n" +
                    "        int     21h\n" +
                    "        pop     ax\n" +
                    "        ret\n" +
                    "endp\n" +
                    "\n" +
                    ";************************************\n" +
                    "\n" +
                    "; if bx < cx then exchanges them\n" +
                    "; (works with signed numbers)\n" +
                    "sort    proc    near\n" +
                    "        cmp     bx, cx\n" +
                    "        jge     compared\n" +
                    "        xchg    bx, cx\n" +
                    "compared:\n" +
                    "        ret\n" +
                    "endp\n" +
                    "\n" +
                    ";************************************\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    ";;; these functions are copied from emu8086.inc ;;;\n" +
                    ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;\n" +
                    "\n" +
                    "\n" +
                    "; gets the multi-digit SIGNED number from the keyboard,\n" +
                    "; and stores the result in CX register:\n" +
                    "SCAN_NUM        PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    SI\n" +
                    "        \n" +
                    "        MOV     CX, 0\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        MOV     CS:make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "        ; get char from keyboard\n" +
                    "        ; into AL:\n" +
                    "        MOV     AH, 00h\n" +
                    "        INT     16h\n" +
                    "        ; and print it:\n" +
                    "        MOV     AH, 0Eh\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "        ; check for MINUS:\n" +
                    "        CMP     AL, '-'\n" +
                    "        JE      set_minus\n" +
                    "\n" +
                    "        ; check for ENTER key:\n" +
                    "        CMP     AL, 13  ; carriage return?\n" +
                    "        JNE     not_cr\n" +
                    "        JMP     stop_input\n" +
                    "not_cr:\n" +
                    "\n" +
                    "\n" +
                    "        CMP     AL, 8                   ; 'BACKSPACE' pressed?\n" +
                    "        JNE     backspace_checked\n" +
                    "        MOV     DX, 0                   ; remove last digit by\n" +
                    "        MOV     AX, CX                  ; division:\n" +
                    "        DIV     CS:ten                  ; AX = DX:AX / 10 (DX-rem).\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    ' '                     ; clear position.\n" +
                    "        PUTC    8                       ; backspace again.\n" +
                    "        JMP     next_digit\n" +
                    "backspace_checked:\n" +
                    "\n" +
                    "\n" +
                    "        ; allow only digits:\n" +
                    "        CMP     AL, '0'\n" +
                    "        JAE     ok_AE_0\n" +
                    "        JMP     remove_not_digit\n" +
                    "ok_AE_0:        \n" +
                    "        CMP     AL, '9'\n" +
                    "        JBE     ok_digit\n" +
                    "remove_not_digit:       \n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered not digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for next input.       \n" +
                    "ok_digit:\n" +
                    "\n" +
                    "\n" +
                    "        ; multiply CX by 10 (first time the result is zero)\n" +
                    "        PUSH    AX\n" +
                    "        MOV     AX, CX\n" +
                    "        MUL     CS:ten                  ; DX:AX = AX*10\n" +
                    "        MOV     CX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        ; check if the number is too big\n" +
                    "        ; (result should be 16 bits)\n" +
                    "        CMP     DX, 0\n" +
                    "        JNE     too_big\n" +
                    "\n" +
                    "        ; convert from ASCII code:\n" +
                    "        SUB     AL, 30h\n" +
                    "\n" +
                    "        ; add AL to CX:\n" +
                    "        MOV     AH, 0\n" +
                    "        MOV     DX, CX      ; backup, in case the result will be too big.\n" +
                    "        ADD     CX, AX\n" +
                    "        JC      too_big2    ; jump if the number is too big.\n" +
                    "\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "set_minus:\n" +
                    "        MOV     CS:make_minus, 1\n" +
                    "        JMP     next_digit\n" +
                    "\n" +
                    "too_big2:\n" +
                    "        MOV     CX, DX      ; restore the backuped value before add.\n" +
                    "        MOV     DX, 0       ; DX was zero before backup!\n" +
                    "too_big:\n" +
                    "        MOV     AX, CX\n" +
                    "        DIV     CS:ten  ; reverse last DX:AX = AX*10, make AX = DX:AX / 10\n" +
                    "        MOV     CX, AX\n" +
                    "        PUTC    8       ; backspace.\n" +
                    "        PUTC    ' '     ; clear last entered digit.\n" +
                    "        PUTC    8       ; backspace again.        \n" +
                    "        JMP     next_digit ; wait for Enter/Backspace.\n" +
                    "        \n" +
                    "        \n" +
                    "stop_input:\n" +
                    "        ; check flag:\n" +
                    "        CMP     CS:make_minus, 0\n" +
                    "        JE      not_minus\n" +
                    "        NEG     CX\n" +
                    "not_minus:\n" +
                    "\n" +
                    "        POP     SI\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "make_minus      DB      ?       ; used as a flag.\n" +
                    "SCAN_NUM        ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints number in AX,\n" +
                    "; used with PRINT_NUM_UNS to print signed numbers:\n" +
                    "PRINT_NUM       PROC    NEAR\n" +
                    "        PUSH    DX\n" +
                    "        PUSH    AX\n" +
                    "\n" +
                    "        CMP     AX, 0\n" +
                    "        JNZ     not_zero\n" +
                    "\n" +
                    "        PUTC    '0'\n" +
                    "        JMP     printed\n" +
                    "\n" +
                    "not_zero:\n" +
                    "        ; the check SIGN of AX,\n" +
                    "        ; make absolute if it's negative:\n" +
                    "        CMP     AX, 0\n" +
                    "        JNS     positive\n" +
                    "        NEG     AX\n" +
                    "\n" +
                    "        PUTC    '-'\n" +
                    "\n" +
                    "positive:\n" +
                    "        CALL    PRINT_NUM_UNS\n" +
                    "printed:\n" +
                    "        POP     AX\n" +
                    "        POP     DX\n" +
                    "        RET\n" +
                    "PRINT_NUM       ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this procedure prints out an unsigned\n" +
                    "; number in AX (not just a single digit)\n" +
                    "; allowed values are from 0 to 65535 (FFFF)\n" +
                    "PRINT_NUM_UNS   PROC    NEAR\n" +
                    "        PUSH    AX\n" +
                    "        PUSH    BX\n" +
                    "        PUSH    CX\n" +
                    "        PUSH    DX\n" +
                    "\n" +
                    "        ; flag to prevent printing zeros before number:\n" +
                    "        MOV     CX, 1\n" +
                    "\n" +
                    "        ; (result of \"/ 10000\" is always less or equal to 9).\n" +
                    "        MOV     BX, 10000       ; 2710h - divider.\n" +
                    "\n" +
                    "        ; AX is zero?\n" +
                    "        CMP     AX, 0\n" +
                    "        JZ      print_zero\n" +
                    "\n" +
                    "begin_print:\n" +
                    "\n" +
                    "        ; check divider (if zero go to end_print):\n" +
                    "        CMP     BX,0\n" +
                    "        JZ      end_print\n" +
                    "\n" +
                    "        ; avoid printing zeros before number:\n" +
                    "        CMP     CX, 0\n" +
                    "        JE      calc\n" +
                    "        ; if AX<BX then result of DIV will be zero:\n" +
                    "        CMP     AX, BX\n" +
                    "        JB      skip\n" +
                    "calc:\n" +
                    "        MOV     CX, 0   ; set flag.\n" +
                    "\n" +
                    "        MOV     DX, 0\n" +
                    "        DIV     BX      ; AX = DX:AX / BX   (DX=remainder).\n" +
                    "\n" +
                    "        ; print last digit\n" +
                    "        ; AH is always ZERO, so it's ignored\n" +
                    "        ADD     AL, 30h    ; convert to ASCII code.\n" +
                    "        PUTC    AL\n" +
                    "\n" +
                    "\n" +
                    "        MOV     AX, DX  ; get remainder from last div.\n" +
                    "\n" +
                    "skip:\n" +
                    "        ; calculate BX=BX/10\n" +
                    "        PUSH    AX\n" +
                    "        MOV     DX, 0\n" +
                    "        MOV     AX, BX\n" +
                    "        DIV     CS:ten  ; AX = DX:AX / 10   (DX=remainder).\n" +
                    "        MOV     BX, AX\n" +
                    "        POP     AX\n" +
                    "\n" +
                    "        JMP     begin_print\n" +
                    "        \n" +
                    "print_zero:\n" +
                    "        PUTC    '0'\n" +
                    "        \n" +
                    "end_print:\n" +
                    "\n" +
                    "        POP     DX\n" +
                    "        POP     CX\n" +
                    "        POP     BX\n" +
                    "        POP     AX\n" +
                    "        RET\n" +
                    "PRINT_NUM_UNS   ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "ten             DW      10      ; used as multiplier/divider by SCAN_NUM & PRINT_NUM_UNS.\n" +
                    "\n" +
                    "\n" +
                    "; this procedure clears the screen,\n" +
                    "; (done by scrolling entire screen window),\n" +
                    "; and sets cursor position on top of it:\n" +
                    "CLEAR_SCREEN PROC NEAR\n" +
                    "        PUSH    AX      ; store registers...\n" +
                    "        PUSH    DS      ;\n" +
                    "        PUSH    BX      ;\n" +
                    "        PUSH    CX      ;\n" +
                    "        PUSH    DI      ;\n" +
                    "\n" +
                    "        MOV     AX, 40h\n" +
                    "        MOV     DS, AX  ; for getting screen parameters.\n" +
                    "        MOV     AH, 06h ; scroll up function id.\n" +
                    "        MOV     AL, 0   ; scroll all lines!\n" +
                    "        MOV     BH, 07  ; attribute for new lines.\n" +
                    "        MOV     CH, 0   ; upper row.\n" +
                    "        MOV     CL, 0   ; upper col.\n" +
                    "        MOV     DI, 84h ; rows on screen -1,\n" +
                    "        MOV     DH, [DI] ; lower row (byte).\n" +
                    "        MOV     DI, 4Ah ; columns on screen,\n" +
                    "        MOV     DL, [DI]\n" +
                    "        DEC     DL      ; lower col.\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "        ; set cursor position to top\n" +
                    "        ; of the screen:\n" +
                    "        MOV     BH, 0   ; current page.\n" +
                    "        MOV     DL, 0   ; col.\n" +
                    "        MOV     DH, 0   ; row.\n" +
                    "        MOV     AH, 02\n" +
                    "        INT     10h\n" +
                    "\n" +
                    "        POP     DI      ; re-store registers...\n" +
                    "        POP     CX      ;\n" +
                    "        POP     BX      ;\n" +
                    "        POP     DS      ;\n" +
                    "        POP     AX      ;\n" +
                    "\n" +
                    "        RET\n" +
                    "CLEAR_SCREEN ENDP\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "code    ends\n" +
                    "       \n" +
                    "       \n" +
                    "        end     start    ; stop assembler and set entry point.\n",





            "; this sample shows how the stack works. \n" +
                    "; click 'stack' button in emulator to see the contents of the stack.\n" +
                    "\n" +
                    "; stack is important element in computer architecture.\n" +
                    "\n" +
                    "; this code does nothing useful, except printing \"Hi\" in the end.\n" +
                    "\n" +
                    "name \"stack\"\n" +
                    "\n" +
                    "org     100h   ; create tiny com file.\n" +
                    "\n" +
                    "mov     ax, 1234h\n" +
                    "push    ax\n" +
                    "\n" +
                    "mov     dx, 5678h\n" +
                    "push    dx\n" +
                    "\n" +
                    "pop     bx\n" +
                    "pop     cx\n" +
                    "\n" +
                    "; function call pushes ip value of the next instruction:\n" +
                    "\n" +
                    "call    tfunc\n" +
                    "\n" +
                    "mov     ax, 7890h\n" +
                    "push    ax\n" +
                    "pop     bx\n" +
                    "\n" +
                    "; interrupts are like funtions,\n" +
                    "; but in addition they push code segment into the stack\n" +
                    "mov     ax, 3\n" +
                    "int     10h    ; set standart video mode.\n" +
                    "\n" +
                    "; a typical use of stack is to set segment registers.\n" +
                    "; set ds to video memory segment:\n" +
                    "mov     ax, 0b800h\n" +
                    "push    ax\n" +
                    "pop     ds\n" +
                    "\n" +
                    "; print \"hi\":\n" +
                    "mov     [170h], 'H'\n" +
                    "mov     [172h], 'i'\n" +
                    "\n" +
                    "; color attribute for 'h'\n" +
                    "mov     [171h], 11001110b\n" +
                    "\n" +
                    "; color attribute for 'i'\n" +
                    "mov     [173h], 10011110b\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key press....\n" +
                    "mov     ah, 0\n" +
                    "int     16h      \n" +
                    "\n" +
                    "; here we \"pop\" the ip value,\n" +
                    "; and return control to the operating system:\n" +
                    "ret\n" +
                    "\n" +
                    "; the test procedure:\n" +
                    "\n" +
                    "tfunc   proc\n" +
                    "\n" +
                    "        xor     bx, bx\n" +
                    "        xor     cx, cx\n" +
                    "\n" +
                    "; here we \"pop\" the ip value,\n" +
                    "; and return control to the main program:\n" +
                    "        ret\n" +
                    "endp\n",





            "\n" +
                    "\n" +
                    "\n" +
                    "; this is an example of out instruction.\n" +
                    "; it writes values to virtual i/o port\n" +
                    "; that controls the stepper-motor.\n" +
                    "; c:\\emu8086\\devices\\stepper_motor.exe is on port 7\n" +
                    "\n" +
                    "#start=stepper_motor.exe#\n" +
                    "\n" +
                    "\n" +
                    "name \"stepper\"\n" +
                    "\n" +
                    "#make_bin#\n" +
                    "\n" +
                    "steps_before_direction_change = 20h ; 32 (decimal)\n" +
                    "\n" +
                    "jmp start\n" +
                    "\n" +
                    "; ========= data ===============\n" +
                    "\n" +
                    "; bin data for clock-wise\n" +
                    "; half-step rotation:\n" +
                    "datcw    db 0000_0110b\n" +
                    "         db 0000_0100b    \n" +
                    "         db 0000_0011b\n" +
                    "         db 0000_0010b\n" +
                    "\n" +
                    "; bin data for counter-clock-wise\n" +
                    "; half-step rotation:\n" +
                    "datccw   db 0000_0011b\n" +
                    "         db 0000_0001b    \n" +
                    "         db 0000_0110b\n" +
                    "         db 0000_0010b\n" +
                    "\n" +
                    "\n" +
                    "; bin data for clock-wise\n" +
                    "; full-step rotation:\n" +
                    "datcw_fs db 0000_0001b\n" +
                    "         db 0000_0011b    \n" +
                    "         db 0000_0110b\n" +
                    "         db 0000_0000b\n" +
                    "\n" +
                    "; bin data for counter-clock-wise\n" +
                    "; full-step rotation:\n" +
                    "datccw_fs db 0000_0100b\n" +
                    "          db 0000_0110b    \n" +
                    "          db 0000_0011b\n" +
                    "          db 0000_0000b\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "mov bx, offset datcw ; start from clock-wise half-step.\n" +
                    "mov si, 0\n" +
                    "mov cx, 0 ; step counter\n" +
                    "\n" +
                    "next_step:\n" +
                    "; motor sets top bit when it's ready to accept new command\n" +
                    "wait:   in al, 7     \n" +
                    "        test al, 10000000b\n" +
                    "        jz wait\n" +
                    "\n" +
                    "mov al, [bx][si]\n" +
                    "out 7, al\n" +
                    "\n" +
                    "inc si\n" +
                    "\n" +
                    "cmp si, 4\n" +
                    "jb next_step\n" +
                    "mov si, 0\n" +
                    "\n" +
                    "inc cx\n" +
                    "cmp cx, steps_before_direction_change\n" +
                    "jb  next_step\n" +
                    "\n" +
                    "mov cx, 0\n" +
                    "add bx, 4 ; next bin data\n" +
                    "\n" +
                    "cmp bx, offset datccw_fs\n" +
                    "jbe next_step\n" +
                    "\n" +
                    "mov bx, offset datcw ; return to clock-wise half-step.\n" +
                    "\n" +
                    "jmp next_step\n" +
                    "\n" +
                    "\n" +
                    "\n",






            "\n" +
                    "; this example demonstrates the input and output string functions of emu8086.inc\n" +
                    "; this code doesnt depend on MS-DOS or any other operating system's interrupts, therefore\n" +
                    "; it can easily be used for developing an operating system or a boot record loader.\n" +
                    "\n" +
                    "name \"string\"\n" +
                    "\n" +
                    "; this macro prints a string that is given as a parameter, example:\n" +
                    "; print 'hello world!'\n" +
                    "print   macro   sdat\n" +
                    "local   next_char, s_dcl, printed, skip_dcl\n" +
                    "push    ax      ; store registers...\n" +
                    "push    si      ;\n" +
                    "jmp     skip_dcl        ; skip declaration.\n" +
                    "        s_dcl db sdat, 0\n" +
                    "skip_dcl:\n" +
                    "        lea     si, s_dcl\n" +
                    "next_char:      \n" +
                    "        mov     al, cs:[si]\n" +
                    "        cmp     al, 0\n" +
                    "        jz      printed\n" +
                    "        inc     si\n" +
                    "        mov     ah, 0eh ; teletype function.\n" +
                    "        int     10h\n" +
                    "        jmp     next_char\n" +
                    "printed:\n" +
                    "pop     si      ; re-store registers...\n" +
                    "pop     ax      ;\n" +
                    "print   endm\n" +
                    "\n" +
                    "\n" +
                    "; this macro prints a string that is given as a parameter, example:\n" +
                    "; printn 'hello world!'\n" +
                    "; the same as print, but new line is automatically added.\n" +
                    "printn   macro   sdat\n" +
                    "local   next_char, s_dcl, printed, skip_dcl\n" +
                    "push    ax      ; store registers...\n" +
                    "push    si      ;\n" +
                    "jmp     skip_dcl        ; skip declaration.\n" +
                    "        s_dcl db sdat, 0Dh, 10, 0\n" +
                    "skip_dcl:\n" +
                    "        lea     si, s_dcl\n" +
                    "next_char:      \n" +
                    "        mov     al, cs:[si]\n" +
                    "        cmp     al, 0\n" +
                    "        jz      printed\n" +
                    "        inc     si\n" +
                    "        mov     ah, 0eh ; teletype function.\n" +
                    "        int     10h\n" +
                    "        jmp     next_char\n" +
                    "printed:\n" +
                    "pop     si      ; re-store registers...\n" +
                    "pop     ax      ;\n" +
                    "printn   endm\n" +
                    "\n" +
                    "\n" +
                    "; this macro prints a char in al and advances\n" +
                    "; the current cursor position:\n" +
                    "putc    macro   char\n" +
                    "        push    ax\n" +
                    "        mov     al, char\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h     \n" +
                    "        pop     ax\n" +
                    "putc    endm\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "org     100h\n" +
                    "\n" +
                    "jmp start  ; skip over the declarations and data\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "buffer db \"empty buffer --- empty buffer\"\n" +
                    "size = $ - offset buffer  ; declare constant\n" +
                    "msg1   db \"Enter a string: \", 0\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "; print a welcome message:\n" +
                    "lea     si, msg1\n" +
                    "call    print_string\n" +
                    "\n" +
                    "; get string to ds:di\n" +
                    "lea     di, buffer      ; buffer offset.\n" +
                    "mov     dx, size        ; buffer size.\n" +
                    "call    get_string\n" +
                    "\n" +
                    "putc    0Dh\n" +
                    "putc    10 ; next line.\n" +
                    "\n" +
                    "; print using macro:\n" +
                    "print \"You've entered: \"\n" +
                    "\n" +
                    "; print string in ds:si using procedure:\n" +
                    "mov     si, di\n" +
                    "call    print_string\n" +
                    "\n" +
                    "; wait for any key...\n" +
                    "mov     ax, 0\n" +
                    "int     16h\n" +
                    "\n" +
                    "ret\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; get a null terminated string from keyboard,\n" +
                    "; write it to buffer at ds:di, maximum buffer size is set in dx.\n" +
                    "; 'enter' stops the input.\n" +
                    "get_string      proc    near\n" +
                    "push    ax\n" +
                    "push    cx\n" +
                    "push    di\n" +
                    "push    dx\n" +
                    "\n" +
                    "mov     cx, 0                   ; char counter.\n" +
                    "\n" +
                    "cmp     dx, 1                   ; buffer too small?\n" +
                    "jbe     empty_buffer            ;\n" +
                    "\n" +
                    "dec     dx                      ; reserve space for last zero.\n" +
                    "\n" +
                    "\n" +
                    ";============================\n" +
                    "; eternal loop to get\n" +
                    "; and processes key presses:\n" +
                    "\n" +
                    "wait_for_key:\n" +
                    "\n" +
                    "mov     ah, 0                   ; get pressed key.\n" +
                    "int     16h\n" +
                    "\n" +
                    "cmp     al, 0Dh                  ; 'return' pressed?\n" +
                    "jz      exit\n" +
                    "\n" +
                    "\n" +
                    "cmp     al, 8                   ; 'backspace' pressed?\n" +
                    "jne     add_to_buffer\n" +
                    "jcxz    wait_for_key            ; nothing to remove!\n" +
                    "dec     cx\n" +
                    "dec     di\n" +
                    "putc    8                       ; backspace.\n" +
                    "putc    ' '                     ; clear position.\n" +
                    "putc    8                       ; backspace again.\n" +
                    "jmp     wait_for_key\n" +
                    "\n" +
                    "add_to_buffer:\n" +
                    "\n" +
                    "        cmp     cx, dx          ; buffer is full?\n" +
                    "        jae     wait_for_key    ; if so wait for 'backspace' or 'return'...\n" +
                    "\n" +
                    "        mov     [di], al\n" +
                    "        inc     di\n" +
                    "        inc     cx\n" +
                    "        \n" +
                    "        ; print the key:\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h\n" +
                    "\n" +
                    "jmp     wait_for_key\n" +
                    ";============================\n" +
                    "\n" +
                    "exit:\n" +
                    "\n" +
                    "; terminate by null:\n" +
                    "mov     [di], 0\n" +
                    "\n" +
                    "empty_buffer:\n" +
                    "\n" +
                    "pop     dx\n" +
                    "pop     di\n" +
                    "pop     cx\n" +
                    "pop     ax\n" +
                    "ret\n" +
                    "get_string      endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; print null terminated string at current cursor position,\n" +
                    "; raddress of string in ds:si\n" +
                    "print_string proc near\n" +
                    "push    ax      ; store registers...\n" +
                    "push    si      ;\n" +
                    "\n" +
                    "next_char:      \n" +
                    "        mov     al, [si]\n" +
                    "        cmp     al, 0\n" +
                    "        jz      printed\n" +
                    "        inc     si\n" +
                    "        mov     ah, 0eh ; teletype function.\n" +
                    "        int     10h\n" +
                    "        jmp     next_char\n" +
                    "printed:\n" +
                    "\n" +
                    "pop     si      ; re-store registers...\n" +
                    "pop     ax      ;\n" +
                    "\n" +
                    "ret\n" +
                    "print_string endp\n" +
                    "\n" +
                    "\n",






            "; this short program for emu8086 shows how to keep constant temperature\n" +
                    "; using heater and thermometer (between 60° to 80°),\n" +
                    "; it is assumed that air temperature is lower 60°.\n" +
                    "\n" +
                    "; thermometer.exe is started automatically from c:\\emu8086\\devices.\n" +
                    "; it is also accessible from the \"virtual devices\" menu of the emulator.\n" +
                    "\n" +
                    "#start=thermometer.exe#\n" +
                    "\n" +
                    "; temperature rises fast, thus emulator should be set to run at the maximum speed.\n" +
                    "\n" +
                    "; if closed, the thermometer window can be re-opened from emulator's \"virtual devices\" menu.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "#make_bin#\n" +
                    "\n" +
                    "name \"thermo\"\n" +
                    "\n" +
                    "; set data segment to code segment:\n" +
                    "mov ax, cs\n" +
                    "mov ds, ax\n" +
                    "\n" +
                    "start:\n" +
                    "\n" +
                    "in al, 125\n" +
                    "\n" +
                    "cmp al, 60\n" +
                    "jl  low\n" +
                    "\n" +
                    "cmp al, 80\n" +
                    "jle  ok\n" +
                    "jg   high\n" +
                    "\n" +
                    "low:\n" +
                    "mov al, 1\n" +
                    "out 127, al   ; turn heater \"on\".\n" +
                    "jmp ok\n" +
                    "\n" +
                    "high:\n" +
                    "mov al, 0\n" +
                    "out 127, al   ; turn heater \"off\". \n" +
                    "\n" +
                    "ok:\n" +
                    "jmp start   ; endless loop.\n" +
                    "\n" +
                    "\n",






            "; this sample shows the use of a timer function (int 15h / 86h)\n" +
                    "; this code prints some chars with 1 second delay.\n" +
                    "\n" +
                    "; note: Windows XP does not support this interrupt (always sets CF=1),\n" +
                    "; to test this program in real environment write it to a floppy disk using \n" +
                    "; compiled writebin.asm. after sucessfull  compilation of both files,\n" +
                    "; type this from command prompt:   writebin timer.bin   \n" +
                    "\n" +
                    "; note: floppy disk boot record will be overwritten.\n" +
                    ";       the floppy will not be useable under windows/dos until\n" +
                    ";       you reformat it, data on floppy disk may be lost.\n" +
                    ";       use empty floppy disks only.\n" +
                    "\n" +
                    "name \"timer\"\n" +
                    "\n" +
                    "#make_boot#\n" +
                    "org     7c00h\n" +
                    "\n" +
                    "; set the segment registers\n" +
                    "mov     ax, cs\n" +
                    "mov     ds, ax\n" +
                    "mov     es, ax\n" +
                    "\n" +
                    "\n" +
                    "call set_video_mode\n" +
                    "call clear_screen\n" +
                    "\n" +
                    "\n" +
                    "next_char:\n" +
                    "cmp     count, 0\n" +
                    "jz      stop\n" +
                    "\n" +
                    "; print char:\n" +
                    "mov     al, c1\n" +
                    "mov     ah, 0eh\n" +
                    "int     10h\n" +
                    "\n" +
                    "; next ascii char:\n" +
                    "inc     c1\n" +
                    "dec     count\n" +
                    "\n" +
                    "; set 1 million microseconds interval (1 second)\n" +
                    "mov     cx, 0fh\n" +
                    "mov     dx, 4240h\n" +
                    "mov     ah, 86h\n" +
                    "int     15h\n" +
                    "\n" +
                    "; stop any error:\n" +
                    "jc      stop    \n" +
                    "\n" +
                    "jmp     next_char\n" +
                    "\n" +
                    "stop:\n" +
                    "\n" +
                    "; print message using bios int 10h/13h function\n" +
                    "mov al, 1\n" +
                    "mov bh, 0\n" +
                    "mov bl, 0010_1111b\n" +
                    "mov cx, msg_size\n" +
                    "mov dl, 4\n" +
                    "mov dh, 15\n" +
                    "mov bp, offset msg\n" +
                    "mov ah, 13h\n" +
                    "int 10h\n" +
                    "\n" +
                    "; wait for any key...\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "int 19h            ; reboot\n" +
                    "\n" +
                    "\n" +
                    "count   db      10\n" +
                    "c1      db      'a'\n" +
                    "\n" +
                    "\n" +
                    "msg db \"remove floppy disk and press any key to reboot...\"\n" +
                    "msg_size = $ - msg\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; set video mode and disable blinking (for compatibility).\n" +
                    "set_video_mode proc\n" +
                    "mov     ah, 0\n" +
                    "mov     al, 3 ; text mode 80x25, 16 colors, 8 pages\n" +
                    "int     10h\n" +
                    "; blinking disabled for compatibility with dos,\n" +
                    "; emulator and windows prompt do not blink anyway.\n" +
                    "mov     ax, 1003h\n" +
                    "mov     bx, 0    ; disable blinking.\n" +
                    "int     10h\n" +
                    "ret\n" +
                    "set_video_mode endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; clear the screen by scrolling entire screen window,\n" +
                    "; and set cursor position on top.\n" +
                    "; default attribute is changed to black on white.\n" +
                    "clear_screen proc near\n" +
                    "        push    ax      ; store registers...\n" +
                    "        push    ds      ;\n" +
                    "        push    bx      ;\n" +
                    "        push    cx      ;\n" +
                    "        push    di      ;\n" +
                    "\n" +
                    "        mov     ax, 40h\n" +
                    "        mov     ds, ax  ; for getting screen parameters.\n" +
                    "        mov     ah, 06h ; scroll up function id.\n" +
                    "        mov     al, 0   ; scroll all lines!\n" +
                    "        mov     bh, 1111_0000b  ; attribute for new lines.\n" +
                    "        mov     ch, 0   ; upper row.\n" +
                    "        mov     cl, 0   ; upper col.\n" +
                    "        mov     di, 84h ; rows on screen -1,\n" +
                    "        mov     dh, [di] ; lower row (byte).\n" +
                    "        mov     di, 4ah ; columns on screen,\n" +
                    "        mov     dl, [di]\n" +
                    "        dec     dl      ; lower col.\n" +
                    "        int     10h\n" +
                    "\n" +
                    "        ; set cursor position to top\n" +
                    "        ; of the screen:\n" +
                    "        mov     bh, 0   ; current page.\n" +
                    "        mov     dl, 0   ; col.\n" +
                    "        mov     dh, 0   ; row.\n" +
                    "        mov     ah, 02\n" +
                    "        int     10h\n" +
                    "\n" +
                    "        pop     di      ; re-store registers...\n" +
                    "        pop     cx      ;\n" +
                    "        pop     bx      ;\n" +
                    "        pop     ds      ;\n" +
                    "        pop     ax      ;\n" +
                    "\n" +
                    "        ret\n" +
                    "clear_screen endp",






            "; this program inputs a decimal number\n" +
                    "; and prints out its binary equivalent.\n" +
                    "\n" +
                    "; convertion is done by convert_to_bin procedure,\n" +
                    "; all other stuff is just for input/output.\n" +
                    "\n" +
                    "\n" +
                    "name \"ToBin\"\n" +
                    "\n" +
                    "org 100h\n" +
                    "\n" +
                    "; skipt data area:\n" +
                    "jmp start\n" +
                    "\n" +
                    "; ascii buffer holds 16 bits of binary equivalent:\n" +
                    "result db 16 dup('x'), 'b'\n" +
                    "msg1 db \"supported values from -32768 to 65535\", 0Dh,0Ah\n" +
                    "     db \"enter the number: $\"\n" +
                    "\n" +
                    "msg2 db 0Dh,0Ah, \"converted to binary: $\"\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "start:\n" +
                    "; print the message1:\n" +
                    "mov dx, offset msg1\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "call scan_num ; get the number to cx.\n" +
                    "\n" +
                    "mov bx, cx\n" +
                    "\n" +
                    "call convert_to_bin ; convert number in bx to result.\n" +
                    "\n" +
                    "; print the message2:\n" +
                    "mov dx, offset msg2\n" +
                    "mov ah, 9\n" +
                    "int 21h\n" +
                    "\n" +
                    "\n" +
                    "; print the result string backwards:\n" +
                    "mov si, offset result  ; set buffer's address to si.\n" +
                    "mov ah, 0eh            ; teletype function of bios.\n" +
                    "mov cx, 17             ; print 16 bits + suffix 'b'.\n" +
                    "print_me:\n" +
                    "\tmov al, [si]\n" +
                    "\tint 10h ; print in teletype mode.\n" +
                    "\tinc si\n" +
                    "loop print_me\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; wait for any key....\n" +
                    "mov ah, 0\n" +
                    "int 16h\n" +
                    "\n" +
                    "\n" +
                    "ret ; return to operating system.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; procedure to convert number in bx to its binary equivalent.\n" +
                    "; result is stored in ascii buffer string.\n" +
                    "convert_to_bin    proc     near\n" +
                    "pusha\n" +
                    "\n" +
                    "lea di, result\n" +
                    "\n" +
                    "; print result in binary:\n" +
                    "mov cx, 16\n" +
                    "print: mov ah, 2   ; print function.\n" +
                    "       mov [di], '0'\n" +
                    "       test bx, 1000_0000_0000_0000b  ; test first bit.\n" +
                    "       jz zero\n" +
                    "       mov [di], '1'\n" +
                    "zero:  shl bx, 1\n" +
                    "       inc di\n" +
                    "loop print\n" +
                    "\n" +
                    "popa\n" +
                    "ret\n" +
                    "convert_to_bin   endp\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "; this macro prints a char in al and advances the current cursor position:\n" +
                    "putc    macro   char\n" +
                    "        push    ax\n" +
                    "        mov     al, char\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h     \n" +
                    "        pop     ax\n" +
                    "endm\n" +
                    "\n" +
                    "; this procedure gets the multi-digit signed number from the keyboard,\n" +
                    "; and stores the result in cx register:\n" +
                    "scan_num        proc    near\n" +
                    "        push    dx\n" +
                    "        push    ax\n" +
                    "        push    si\n" +
                    "        \n" +
                    "        mov     cx, 0\n" +
                    "\n" +
                    "        ; reset flag:\n" +
                    "        mov     cs:make_minus, 0\n" +
                    "\n" +
                    "next_digit:\n" +
                    "\n" +
                    "        ; get char from keyboard\n" +
                    "        ; into al:\n" +
                    "        mov     ah, 00h\n" +
                    "        int     16h\n" +
                    "        ; and print it:\n" +
                    "        mov     ah, 0eh\n" +
                    "        int     10h\n" +
                    "\n" +
                    "        ; check for minus:\n" +
                    "        cmp     al, '-'\n" +
                    "        je      set_minus\n" +
                    "\n" +
                    "        ; check for enter key:\n" +
                    "        cmp     al, 13  ; carriage return?\n" +
                    "        jne     not_cr\n" +
                    "        jmp     stop_input\n" +
                    "not_cr:\n" +
                    "\n" +
                    "\n" +
                    "        cmp     al, 8                   ; 'backspace' pressed?\n" +
                    "        jne     backspace_checked\n" +
                    "        mov     dx, 0                   ; remove last digit by\n" +
                    "        mov     ax, cx                  ; division:\n" +
                    "        div     cs:ten                  ; ax = dx:ax / 10 (dx-rem).\n" +
                    "        mov     cx, ax\n" +
                    "        putc    ' '                     ; clear position.\n" +
                    "        putc    8                       ; backspace again.\n" +
                    "        jmp     next_digit\n" +
                    "backspace_checked:\n" +
                    "\n" +
                    "\n" +
                    "        ; allow only digits:\n" +
                    "        cmp     al, '0'\n" +
                    "        jae     ok_ae_0\n" +
                    "        jmp     remove_not_digit\n" +
                    "ok_ae_0:        \n" +
                    "        cmp     al, '9'\n" +
                    "        jbe     ok_digit\n" +
                    "remove_not_digit:       \n" +
                    "        putc    8       ; backspace.\n" +
                    "        putc    ' '     ; clear last entered not digit.\n" +
                    "        putc    8       ; backspace again.        \n" +
                    "        jmp     next_digit ; wait for next input.       \n" +
                    "ok_digit:\n" +
                    "\n" +
                    "\n" +
                    "        ; multiply cx by 10 (first time the result is zero)\n" +
                    "        push    ax\n" +
                    "        mov     ax, cx\n" +
                    "        mul     cs:ten                  ; dx:ax = ax*10\n" +
                    "        mov     cx, ax\n" +
                    "        pop     ax\n" +
                    "\n" +
                    "        ; check if the number is too big\n" +
                    "        ; (result should be 16 bits)\n" +
                    "        cmp     dx, 0\n" +
                    "        jne     too_big\n" +
                    "\n" +
                    "        ; convert from ascii code:\n" +
                    "        sub     al, 30h\n" +
                    "\n" +
                    "        ; add al to cx:\n" +
                    "        mov     ah, 0\n" +
                    "        mov     dx, cx      ; backup, in case the result will be too big.\n" +
                    "        add     cx, ax\n" +
                    "        jc      too_big2    ; jump if the number is too big.\n" +
                    "\n" +
                    "        jmp     next_digit\n" +
                    "\n" +
                    "set_minus:\n" +
                    "        mov     cs:make_minus, 1\n" +
                    "        jmp     next_digit\n" +
                    "\n" +
                    "too_big2:\n" +
                    "        mov     cx, dx      ; restore the backuped value before add.\n" +
                    "        mov     dx, 0       ; dx was zero before backup!\n" +
                    "too_big:\n" +
                    "        mov     ax, cx\n" +
                    "        div     cs:ten  ; reverse last dx:ax = ax*10, make ax = dx:ax / 10\n" +
                    "        mov     cx, ax\n" +
                    "        putc    8       ; backspace.\n" +
                    "        putc    ' '     ; clear last entered digit.\n" +
                    "        putc    8       ; backspace again.        \n" +
                    "        jmp     next_digit ; wait for enter/backspace.\n" +
                    "        \n" +
                    "        \n" +
                    "stop_input:\n" +
                    "        ; check flag:\n" +
                    "        cmp     cs:make_minus, 0\n" +
                    "        je      not_minus\n" +
                    "        neg     cx\n" +
                    "not_minus:\n" +
                    "\n" +
                    "        pop     si\n" +
                    "        pop     ax\n" +
                    "        pop     dx\n" +
                    "        ret\n" +
                    "make_minus      db      ?       ; used as a flag.\n" +
                    "ten             dw      10      ; used as multiplier.\n" +
                    "scan_num        endp\n" +
                    "\n",





            "; procedures inside another procedure.\n" +
                    "\n" +
                    "\n" +
                    "org 100h\n" +
                    "      \n" +
                    "mov ax, abc               \n" +
                    "mov abc_off, ax     \n" +
                    "mov abc_seg, cs\n" +
                    "     \n" +
                    "\n" +
                    "call far abc_off\n" +
                    "call abc1\n" +
                    "call abc2\n" +
                    "ret\n" +
                    "   \n" +
                    "abc_off dw ?\n" +
                    "abc_seg dw ?\n" +
                    "\n" +
                    "abc    proc     far \n" +
                    "  mov ax, -1\n" +
                    "  jmp r\n" +
                    "  \n" +
                    "  abc1   proc   near \n" +
                    "         mov ax, 1 \n" +
                    "         ret \n" +
                    "  endp \n" +
                    "\n" +
                    "\n" +
                    "  abc2   proc   near\n" +
                    "         mov ax, 2\n" +
                    "         ret \n" +
                    "  endp \n" +
                    "  \n" +
                    "  r:\n" +
                    "  retf\n" +
                    "endp \n" +
                    " \n" +
                    " \n" +
                    " ",




            "; two procedures, one return.\n" +
                    "\n" +
                    "call a1\n" +
                    "call a2\n" +
                    "ret\n" +
                    "\n" +
                    "a1:\n" +
                    "mov ax, 1\n" +
                    "a2:\n" +
                    "add ax, 3\n" +
                    "ret  \n" +
                    "\n"



    };


}
